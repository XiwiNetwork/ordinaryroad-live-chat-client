/*
 * MIT License
 *
 * Copyright (c) 2023 OrdinaryRoad
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_webcast_chat_message_msg.proto

package tech.ordinaryroad.live.chat.client.douyin.protobuf;

public final class Douyin_webcast_chat_message_msgProto {
  private Douyin_webcast_chat_message_msgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tech_ordinaryroad_live_chat_client_bilibili_protobuf_douyin_webcast_chat_message_msg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tech_ordinaryroad_live_chat_client_bilibili_protobuf_douyin_webcast_chat_message_msg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%douyin_webcast_chat_message_msg.proto\022" +
      "4tech.ordinaryroad.live.chat.client.bili" +
      "bili.protobuf\032\014Common.proto\032\nUser.proto\032" +
      "\013Image.proto\"\300\003\n\037douyin_webcast_chat_mes" +
      "sage_msg\022\027\n\006common\030\001 \001(\0132\007.Common\022\023\n\004use" +
      "r\030\002 \001(\0132\005.User\022\017\n\007content\030\003 \001(\t\022\031\n\021visib" +
      "le_to_sender\030\004 \001(\010\022 \n\020background_image\030\005" +
      " \001(\0132\006.Image\022\036\n\026full_screen_text_color\030\006" +
      " \001(\t\022#\n\023background_image_v2\030\007 \001(\0132\006.Imag" +
      "e\022\032\n\ngift_image\030\n \001(\0132\006.Image\022\024\n\014agree_m" +
      "sg_id\030\013 \001(\004\022\026\n\016priority_level\030\014 \001(\r\022\022\n\ne" +
      "vent_time\030\017 \001(\004\022\023\n\013send_review\030\020 \001(\010\022\025\n\r" +
      "from_intercom\030\021 \001(\010\022\037\n\027intercom_hide_use" +
      "r_card\030\022 \001(\010\022\017\n\007chat_by\030\024 \001(\t\022 \n\030individ" +
      "ual_chat_priority\030\025 \001(\rBb\n2tech.ordinary" +
      "road.live.chat.client.douyin.protobufB$D" +
      "ouyin_webcast_chat_message_msgProtoP\001\242\002\003" +
      "GPBb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.getDescriptor(),
          tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.UserOuterClass.getDescriptor(),
          tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.ImageOuterClass.getDescriptor(),
        });
    internal_static_tech_ordinaryroad_live_chat_client_bilibili_protobuf_douyin_webcast_chat_message_msg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tech_ordinaryroad_live_chat_client_bilibili_protobuf_douyin_webcast_chat_message_msg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tech_ordinaryroad_live_chat_client_bilibili_protobuf_douyin_webcast_chat_message_msg_descriptor,
        new java.lang.String[] { "Common", "User", "Content", "VisibleToSender", "BackgroundImage", "FullScreenTextColor", "BackgroundImageV2", "GiftImage", "AgreeMsgId", "PriorityLevel", "EventTime", "SendReview", "FromIntercom", "IntercomHideUserCard", "ChatBy", "IndividualChatPriority", });
    tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.getDescriptor();
    tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.UserOuterClass.getDescriptor();
    tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.ImageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}