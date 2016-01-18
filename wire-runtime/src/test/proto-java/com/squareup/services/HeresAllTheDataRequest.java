// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: simple_service2.proto at 5:1
package com.squareup.services;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class HeresAllTheDataRequest extends Message<HeresAllTheDataRequest, HeresAllTheDataRequest.Builder> {
  public static final ProtoAdapter<HeresAllTheDataRequest> ADAPTER = new ProtoAdapter_HeresAllTheDataRequest();

  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_DATA = ByteString.EMPTY;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public final ByteString data;

  public HeresAllTheDataRequest(ByteString data) {
    this(data, ByteString.EMPTY);
  }

  public HeresAllTheDataRequest(ByteString data, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.data = data;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.data = data;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof HeresAllTheDataRequest)) return false;
    HeresAllTheDataRequest o = (HeresAllTheDataRequest) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(data, o.data);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (data != null ? data.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (data != null) builder.append(", data=").append(data);
    return builder.replace(0, 2, "HeresAllTheDataRequest{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<HeresAllTheDataRequest, Builder> {
    public ByteString data;

    public Builder() {
    }

    public Builder data(ByteString data) {
      this.data = data;
      return this;
    }

    @Override
    public HeresAllTheDataRequest build() {
      return new HeresAllTheDataRequest(data, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_HeresAllTheDataRequest extends ProtoAdapter<HeresAllTheDataRequest> {
    ProtoAdapter_HeresAllTheDataRequest() {
      super(FieldEncoding.LENGTH_DELIMITED, HeresAllTheDataRequest.class);
    }

    @Override
    public int encodedSize(HeresAllTheDataRequest value) {
      return (value.data != null ? ProtoAdapter.BYTES.encodedSizeWithTag(1, value.data) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, HeresAllTheDataRequest value) throws IOException {
      if (value.data != null) ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.data);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public HeresAllTheDataRequest decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.data(ProtoAdapter.BYTES.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public HeresAllTheDataRequest redact(HeresAllTheDataRequest value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
