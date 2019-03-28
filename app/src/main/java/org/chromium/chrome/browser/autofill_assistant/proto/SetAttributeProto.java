// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Set an element attribute to a specific value.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.SetAttributeProto}
 */
public  final class SetAttributeProto extends
    com.google.protobuf.GeneratedMessageLite<
        SetAttributeProto, SetAttributeProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.SetAttributeProto)
    SetAttributeProtoOrBuilder {
  private SetAttributeProto() {
    attribute_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    value_ = "";
  }
  private int bitField0_;
  public static final int ELEMENT_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto element_;
  /**
   * <pre>
   * A reference to the form element whose attribute should be set.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
   */
  public boolean hasElement() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * A reference to the form element whose attribute should be set.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto getElement() {
    return element_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.getDefaultInstance() : element_;
  }
  /**
   * <pre>
   * A reference to the form element whose attribute should be set.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
   */
  private void setElement(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    element_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * A reference to the form element whose attribute should be set.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
   */
  private void setElement(
      org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.Builder builderForValue) {
    element_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * A reference to the form element whose attribute should be set.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
   */
  private void mergeElement(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
    if (element_ != null &&
        element_ != org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.getDefaultInstance()) {
      element_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.newBuilder(element_).mergeFrom(value).buildPartial();
    } else {
      element_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * A reference to the form element whose attribute should be set.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
   */
  private void clearElement() {  element_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int ATTRIBUTE_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.ProtobufList<String> attribute_;
  /**
   * <pre>
   * The attribute to set, e.g. ["style", "position"] to change
   * element.style.position.
   * </pre>
   *
   * <code>repeated string attribute = 2;</code>
   */
  public java.util.List<String> getAttributeList() {
    return attribute_;
  }
  /**
   * <pre>
   * The attribute to set, e.g. ["style", "position"] to change
   * element.style.position.
   * </pre>
   *
   * <code>repeated string attribute = 2;</code>
   */
  public int getAttributeCount() {
    return attribute_.size();
  }
  /**
   * <pre>
   * The attribute to set, e.g. ["style", "position"] to change
   * element.style.position.
   * </pre>
   *
   * <code>repeated string attribute = 2;</code>
   */
  public java.lang.String getAttribute(int index) {
    return attribute_.get(index);
  }
  /**
   * <pre>
   * The attribute to set, e.g. ["style", "position"] to change
   * element.style.position.
   * </pre>
   *
   * <code>repeated string attribute = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAttributeBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        attribute_.get(index));
  }
  private void ensureAttributeIsMutable() {
    if (!attribute_.isModifiable()) {
      attribute_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(attribute_);
     }
  }
  /**
   * <pre>
   * The attribute to set, e.g. ["style", "position"] to change
   * element.style.position.
   * </pre>
   *
   * <code>repeated string attribute = 2;</code>
   */
  private void setAttribute(
      int index, java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureAttributeIsMutable();
    attribute_.set(index, value);
  }
  /**
   * <pre>
   * The attribute to set, e.g. ["style", "position"] to change
   * element.style.position.
   * </pre>
   *
   * <code>repeated string attribute = 2;</code>
   */
  private void addAttribute(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureAttributeIsMutable();
    attribute_.add(value);
  }
  /**
   * <pre>
   * The attribute to set, e.g. ["style", "position"] to change
   * element.style.position.
   * </pre>
   *
   * <code>repeated string attribute = 2;</code>
   */
  private void addAllAttribute(
      java.lang.Iterable<java.lang.String> values) {
    ensureAttributeIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, attribute_);
  }
  /**
   * <pre>
   * The attribute to set, e.g. ["style", "position"] to change
   * element.style.position.
   * </pre>
   *
   * <code>repeated string attribute = 2;</code>
   */
  private void clearAttribute() {
    attribute_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <pre>
   * The attribute to set, e.g. ["style", "position"] to change
   * element.style.position.
   * </pre>
   *
   * <code>repeated string attribute = 2;</code>
   */
  private void addAttributeBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureAttributeIsMutable();
    attribute_.add(value.toStringUtf8());
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private java.lang.String value_;
  /**
   * <pre>
   * The value to set.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   */
  public boolean hasValue() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * The value to set.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   */
  public java.lang.String getValue() {
    return value_;
  }
  /**
   * <pre>
   * The value to set.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   */
  public com.google.protobuf.ByteString
      getValueBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(value_);
  }
  /**
   * <pre>
   * The value to set.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   */
  private void setValue(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    value_ = value;
  }
  /**
   * <pre>
   * The value to set.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   */
  private void clearValue() {
    bitField0_ = (bitField0_ & ~0x00000002);
    value_ = getDefaultInstance().getValue();
  }
  /**
   * <pre>
   * The value to set.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   */
  private void setValueBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    value_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getElement());
    }
    for (int i = 0; i < attribute_.size(); i++) {
      output.writeString(2, attribute_.get(i));
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(3, getValue());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getElement());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < attribute_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeStringSizeNoTag(attribute_.get(i));
      }
      size += dataSize;
      size += 1 * getAttributeList().size();
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getValue());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Set an element attribute to a specific value.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.SetAttributeProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.SetAttributeProto)
      org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * A reference to the form element whose attribute should be set.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
     */
    public boolean hasElement() {
      return instance.hasElement();
    }
    /**
     * <pre>
     * A reference to the form element whose attribute should be set.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto getElement() {
      return instance.getElement();
    }
    /**
     * <pre>
     * A reference to the form element whose attribute should be set.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
     */
    public Builder setElement(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
      copyOnWrite();
      instance.setElement(value);
      return this;
      }
    /**
     * <pre>
     * A reference to the form element whose attribute should be set.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
     */
    public Builder setElement(
        org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.Builder builderForValue) {
      copyOnWrite();
      instance.setElement(builderForValue);
      return this;
    }
    /**
     * <pre>
     * A reference to the form element whose attribute should be set.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
     */
    public Builder mergeElement(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
      copyOnWrite();
      instance.mergeElement(value);
      return this;
    }
    /**
     * <pre>
     * A reference to the form element whose attribute should be set.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
     */
    public Builder clearElement() {  copyOnWrite();
      instance.clearElement();
      return this;
    }

    /**
     * <pre>
     * The attribute to set, e.g. ["style", "position"] to change
     * element.style.position.
     * </pre>
     *
     * <code>repeated string attribute = 2;</code>
     */
    public java.util.List<String>
        getAttributeList() {
      return java.util.Collections.unmodifiableList(
          instance.getAttributeList());
    }
    /**
     * <pre>
     * The attribute to set, e.g. ["style", "position"] to change
     * element.style.position.
     * </pre>
     *
     * <code>repeated string attribute = 2;</code>
     */
    public int getAttributeCount() {
      return instance.getAttributeCount();
    }
    /**
     * <pre>
     * The attribute to set, e.g. ["style", "position"] to change
     * element.style.position.
     * </pre>
     *
     * <code>repeated string attribute = 2;</code>
     */
    public java.lang.String getAttribute(int index) {
      return instance.getAttribute(index);
    }
    /**
     * <pre>
     * The attribute to set, e.g. ["style", "position"] to change
     * element.style.position.
     * </pre>
     *
     * <code>repeated string attribute = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAttributeBytes(int index) {
      return instance.getAttributeBytes(index);
    }
    /**
     * <pre>
     * The attribute to set, e.g. ["style", "position"] to change
     * element.style.position.
     * </pre>
     *
     * <code>repeated string attribute = 2;</code>
     */
    public Builder setAttribute(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setAttribute(index, value);
      return this;
    }
    /**
     * <pre>
     * The attribute to set, e.g. ["style", "position"] to change
     * element.style.position.
     * </pre>
     *
     * <code>repeated string attribute = 2;</code>
     */
    public Builder addAttribute(
        java.lang.String value) {
      copyOnWrite();
      instance.addAttribute(value);
      return this;
    }
    /**
     * <pre>
     * The attribute to set, e.g. ["style", "position"] to change
     * element.style.position.
     * </pre>
     *
     * <code>repeated string attribute = 2;</code>
     */
    public Builder addAllAttribute(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllAttribute(values);
      return this;
    }
    /**
     * <pre>
     * The attribute to set, e.g. ["style", "position"] to change
     * element.style.position.
     * </pre>
     *
     * <code>repeated string attribute = 2;</code>
     */
    public Builder clearAttribute() {
      copyOnWrite();
      instance.clearAttribute();
      return this;
    }
    /**
     * <pre>
     * The attribute to set, e.g. ["style", "position"] to change
     * element.style.position.
     * </pre>
     *
     * <code>repeated string attribute = 2;</code>
     */
    public Builder addAttributeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addAttributeBytes(value);
      return this;
    }

    /**
     * <pre>
     * The value to set.
     * </pre>
     *
     * <code>optional string value = 3;</code>
     */
    public boolean hasValue() {
      return instance.hasValue();
    }
    /**
     * <pre>
     * The value to set.
     * </pre>
     *
     * <code>optional string value = 3;</code>
     */
    public java.lang.String getValue() {
      return instance.getValue();
    }
    /**
     * <pre>
     * The value to set.
     * </pre>
     *
     * <code>optional string value = 3;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      return instance.getValueBytes();
    }
    /**
     * <pre>
     * The value to set.
     * </pre>
     *
     * <code>optional string value = 3;</code>
     */
    public Builder setValue(
        java.lang.String value) {
      copyOnWrite();
      instance.setValue(value);
      return this;
    }
    /**
     * <pre>
     * The value to set.
     * </pre>
     *
     * <code>optional string value = 3;</code>
     */
    public Builder clearValue() {
      copyOnWrite();
      instance.clearValue();
      return this;
    }
    /**
     * <pre>
     * The value to set.
     * </pre>
     *
     * <code>optional string value = 3;</code>
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setValueBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.SetAttributeProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        attribute_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto other = (org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto) arg1;
        element_ = visitor.visitMessage(element_, other.element_);
        attribute_= visitor.visitList(attribute_, other.attribute_);
        value_ = visitor.visitString(
            hasValue(), value_,
            other.hasValue(), other.value_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(tag, input)) {
                  done = true;
                }
                break;
              }
              case 10: {
                org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = element_.toBuilder();
                }
                element_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(element_);
                  element_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
              case 18: {
                String s = input.readString();
                if (!attribute_.isModifiable()) {
                  attribute_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(attribute_);
                }
                attribute_.add(s);
                break;
              }
              case 26: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                value_ = s;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:autofill_assistant.SetAttributeProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SetAttributeProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SetAttributeProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SetAttributeProto> PARSER;

  public static com.google.protobuf.Parser<SetAttributeProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
