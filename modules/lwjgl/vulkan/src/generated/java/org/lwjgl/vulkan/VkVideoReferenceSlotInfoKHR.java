/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying information about a reference picture slot.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoDecodeH264DpbSlotInfoKHR}, {@link VkVideoDecodeH265DpbSlotInfoKHR}, {@link VkVideoEncodeH264DpbSlotInfoEXT}, or {@link VkVideoEncodeH265DpbSlotInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>If {@code pPictureResource} is not {@code NULL}, {@code pPictureResource} <b>must</b> be a valid pointer to a valid {@link VkVideoPictureResourceInfoKHR} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoBeginCodingInfoKHR}, {@link VkVideoDecodeInfoKHR}, {@link VkVideoEncodeInfoKHR}, {@link VkVideoPictureResourceInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoReferenceSlotInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     int32_t {@link #slotIndex};
 *     {@link VkVideoPictureResourceInfoKHR VkVideoPictureResourceInfoKHR} const * {@link #pPictureResource};
 * }</code></pre>
 */
public class VkVideoReferenceSlotInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SLOTINDEX,
        PPICTURERESOURCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SLOTINDEX = layout.offsetof(2);
        PPICTURERESOURCE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkVideoReferenceSlotInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoReferenceSlotInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the index of the <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> or a negative integer value. */
    @NativeType("int32_t")
    public int slotIndex() { return nslotIndex(address()); }
    /** {@code NULL} or a pointer to a {@link VkVideoPictureResourceInfoKHR} structure describing the <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resources">video picture resource</a> associated with the DPB slot index specified by {@code slotIndex}. */
    @Nullable
    @NativeType("VkVideoPictureResourceInfoKHR const *")
    public VkVideoPictureResourceInfoKHR pPictureResource() { return npPictureResource(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoReferenceSlotInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoReferenceSlotInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoReferenceSlotInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoDecodeH264DpbSlotInfoKHR} value to the {@code pNext} chain. */
    public VkVideoReferenceSlotInfoKHR pNext(VkVideoDecodeH264DpbSlotInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265DpbSlotInfoKHR} value to the {@code pNext} chain. */
    public VkVideoReferenceSlotInfoKHR pNext(VkVideoDecodeH265DpbSlotInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264DpbSlotInfoEXT} value to the {@code pNext} chain. */
    public VkVideoReferenceSlotInfoKHR pNext(VkVideoEncodeH264DpbSlotInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265DpbSlotInfoEXT} value to the {@code pNext} chain. */
    public VkVideoReferenceSlotInfoKHR pNext(VkVideoEncodeH265DpbSlotInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #slotIndex} field. */
    public VkVideoReferenceSlotInfoKHR slotIndex(@NativeType("int32_t") int value) { nslotIndex(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoPictureResourceInfoKHR} to the {@link #pPictureResource} field. */
    public VkVideoReferenceSlotInfoKHR pPictureResource(@Nullable @NativeType("VkVideoPictureResourceInfoKHR const *") VkVideoPictureResourceInfoKHR value) { npPictureResource(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoReferenceSlotInfoKHR set(
        int sType,
        long pNext,
        int slotIndex,
        @Nullable VkVideoPictureResourceInfoKHR pPictureResource
    ) {
        sType(sType);
        pNext(pNext);
        slotIndex(slotIndex);
        pPictureResource(pPictureResource);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoReferenceSlotInfoKHR set(VkVideoReferenceSlotInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoReferenceSlotInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoReferenceSlotInfoKHR malloc() {
        return wrap(VkVideoReferenceSlotInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoReferenceSlotInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoReferenceSlotInfoKHR calloc() {
        return wrap(VkVideoReferenceSlotInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoReferenceSlotInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoReferenceSlotInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoReferenceSlotInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoReferenceSlotInfoKHR} instance for the specified memory address. */
    public static VkVideoReferenceSlotInfoKHR create(long address) {
        return wrap(VkVideoReferenceSlotInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoReferenceSlotInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoReferenceSlotInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoReferenceSlotInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceSlotInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoReferenceSlotInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceSlotInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoReferenceSlotInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceSlotInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoReferenceSlotInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceSlotInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoReferenceSlotInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoReferenceSlotInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoReferenceSlotInfoKHR malloc(MemoryStack stack) {
        return wrap(VkVideoReferenceSlotInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoReferenceSlotInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoReferenceSlotInfoKHR calloc(MemoryStack stack) {
        return wrap(VkVideoReferenceSlotInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoReferenceSlotInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceSlotInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoReferenceSlotInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceSlotInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoReferenceSlotInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoReferenceSlotInfoKHR.PNEXT); }
    /** Unsafe version of {@link #slotIndex}. */
    public static int nslotIndex(long struct) { return UNSAFE.getInt(null, struct + VkVideoReferenceSlotInfoKHR.SLOTINDEX); }
    /** Unsafe version of {@link #pPictureResource}. */
    @Nullable public static VkVideoPictureResourceInfoKHR npPictureResource(long struct) { return VkVideoPictureResourceInfoKHR.createSafe(memGetAddress(struct + VkVideoReferenceSlotInfoKHR.PPICTURERESOURCE)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoReferenceSlotInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoReferenceSlotInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #slotIndex(int) slotIndex}. */
    public static void nslotIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoReferenceSlotInfoKHR.SLOTINDEX, value); }
    /** Unsafe version of {@link #pPictureResource(VkVideoPictureResourceInfoKHR) pPictureResource}. */
    public static void npPictureResource(long struct, @Nullable VkVideoPictureResourceInfoKHR value) { memPutAddress(struct + VkVideoReferenceSlotInfoKHR.PPICTURERESOURCE, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkVideoReferenceSlotInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoReferenceSlotInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoReferenceSlotInfoKHR ELEMENT_FACTORY = VkVideoReferenceSlotInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoReferenceSlotInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoReferenceSlotInfoKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkVideoReferenceSlotInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoReferenceSlotInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoReferenceSlotInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoReferenceSlotInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoReferenceSlotInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoReferenceSlotInfoKHR#slotIndex} field. */
        @NativeType("int32_t")
        public int slotIndex() { return VkVideoReferenceSlotInfoKHR.nslotIndex(address()); }
        /** @return a {@link VkVideoPictureResourceInfoKHR} view of the struct pointed to by the {@link VkVideoReferenceSlotInfoKHR#pPictureResource} field. */
        @Nullable
        @NativeType("VkVideoPictureResourceInfoKHR const *")
        public VkVideoPictureResourceInfoKHR pPictureResource() { return VkVideoReferenceSlotInfoKHR.npPictureResource(address()); }

        /** Sets the specified value to the {@link VkVideoReferenceSlotInfoKHR#sType} field. */
        public VkVideoReferenceSlotInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoReferenceSlotInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR} value to the {@link VkVideoReferenceSlotInfoKHR#sType} field. */
        public VkVideoReferenceSlotInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoReferenceSlotInfoKHR#pNext} field. */
        public VkVideoReferenceSlotInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoReferenceSlotInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoDecodeH264DpbSlotInfoKHR} value to the {@code pNext} chain. */
        public VkVideoReferenceSlotInfoKHR.Buffer pNext(VkVideoDecodeH264DpbSlotInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265DpbSlotInfoKHR} value to the {@code pNext} chain. */
        public VkVideoReferenceSlotInfoKHR.Buffer pNext(VkVideoDecodeH265DpbSlotInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264DpbSlotInfoEXT} value to the {@code pNext} chain. */
        public VkVideoReferenceSlotInfoKHR.Buffer pNext(VkVideoEncodeH264DpbSlotInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265DpbSlotInfoEXT} value to the {@code pNext} chain. */
        public VkVideoReferenceSlotInfoKHR.Buffer pNext(VkVideoEncodeH265DpbSlotInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoReferenceSlotInfoKHR#slotIndex} field. */
        public VkVideoReferenceSlotInfoKHR.Buffer slotIndex(@NativeType("int32_t") int value) { VkVideoReferenceSlotInfoKHR.nslotIndex(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoPictureResourceInfoKHR} to the {@link VkVideoReferenceSlotInfoKHR#pPictureResource} field. */
        public VkVideoReferenceSlotInfoKHR.Buffer pPictureResource(@Nullable @NativeType("VkVideoPictureResourceInfoKHR const *") VkVideoPictureResourceInfoKHR value) { VkVideoReferenceSlotInfoKHR.npPictureResource(address(), value); return this; }

    }

}