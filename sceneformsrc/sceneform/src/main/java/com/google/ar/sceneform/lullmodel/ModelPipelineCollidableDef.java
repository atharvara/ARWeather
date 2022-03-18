// automatically generated by the FlatBuffers compiler, do not modify

package com.google.ar.sceneform.lullmodel;

import java.nio.*;

import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
/**
 * Information about a collidable model.
 */
public final class ModelPipelineCollidableDef extends Table {
  public static ModelPipelineCollidableDef getRootAsModelPipelineCollidableDef(ByteBuffer _bb) { return getRootAsModelPipelineCollidableDef(_bb, new ModelPipelineCollidableDef()); }
  public static ModelPipelineCollidableDef getRootAsModelPipelineCollidableDef(ByteBuffer _bb, ModelPipelineCollidableDef obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public ModelPipelineCollidableDef __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * The name of ModelPipelineImportDef defining this model.
   */
  public String source() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer sourceAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer sourceInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }

  public static int createModelPipelineCollidableDef(FlatBufferBuilder builder,
      int sourceOffset) {
    builder.startObject(1);
    ModelPipelineCollidableDef.addSource(builder, sourceOffset);
    return ModelPipelineCollidableDef.endModelPipelineCollidableDef(builder);
  }

  public static void startModelPipelineCollidableDef(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addSource(FlatBufferBuilder builder, int sourceOffset) { builder.addOffset(0, sourceOffset, 0); }
  public static int endModelPipelineCollidableDef(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

