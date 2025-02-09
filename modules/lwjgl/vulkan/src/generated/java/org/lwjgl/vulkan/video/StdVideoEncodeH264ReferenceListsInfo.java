/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoEncodeH264ReferenceListsInfo {
 *     {@link StdVideoEncodeH264ReferenceListsInfoFlags StdVideoEncodeH264ReferenceListsInfoFlags} flags;
 *     uint8_t refPicList0EntryCount;
 *     uint8_t refPicList1EntryCount;
 *     uint8_t refList0ModOpCount;
 *     uint8_t refList1ModOpCount;
 *     uint8_t refPicMarkingOpCount;
 *     uint8_t reserved1[7];
 *     uint8_t const * pRefPicList0Entries;
 *     uint8_t const * pRefPicList1Entries;
 *     {@link StdVideoEncodeH264RefListModEntry StdVideoEncodeH264RefListModEntry} const * pRefList0ModOperations;
 *     {@link StdVideoEncodeH264RefListModEntry StdVideoEncodeH264RefListModEntry} const * pRefList1ModOperations;
 *     {@link StdVideoEncodeH264RefPicMarkingEntry StdVideoEncodeH264RefPicMarkingEntry} const * pRefPicMarkingOperations;
 * }</code></pre>
 */
public class StdVideoEncodeH264ReferenceListsInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        REFPICLIST0ENTRYCOUNT,
        REFPICLIST1ENTRYCOUNT,
        REFLIST0MODOPCOUNT,
        REFLIST1MODOPCOUNT,
        REFPICMARKINGOPCOUNT,
        RESERVED1,
        PREFPICLIST0ENTRIES,
        PREFPICLIST1ENTRIES,
        PREFLIST0MODOPERATIONS,
        PREFLIST1MODOPERATIONS,
        PREFPICMARKINGOPERATIONS;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeH264ReferenceListsInfoFlags.SIZEOF, StdVideoEncodeH264ReferenceListsInfoFlags.ALIGNOF),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __array(1, 7),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        REFPICLIST0ENTRYCOUNT = layout.offsetof(1);
        REFPICLIST1ENTRYCOUNT = layout.offsetof(2);
        REFLIST0MODOPCOUNT = layout.offsetof(3);
        REFLIST1MODOPCOUNT = layout.offsetof(4);
        REFPICMARKINGOPCOUNT = layout.offsetof(5);
        RESERVED1 = layout.offsetof(6);
        PREFPICLIST0ENTRIES = layout.offsetof(7);
        PREFPICLIST1ENTRIES = layout.offsetof(8);
        PREFLIST0MODOPERATIONS = layout.offsetof(9);
        PREFLIST1MODOPERATIONS = layout.offsetof(10);
        PREFPICMARKINGOPERATIONS = layout.offsetof(11);
    }

    /**
     * Creates a {@code StdVideoEncodeH264ReferenceListsInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH264ReferenceListsInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeH264ReferenceListsInfoFlags} view of the {@code flags} field. */
    public StdVideoEncodeH264ReferenceListsInfoFlags flags() { return nflags(address()); }
    /** @return the value of the {@code refPicList0EntryCount} field. */
    @NativeType("uint8_t")
    public byte refPicList0EntryCount() { return nrefPicList0EntryCount(address()); }
    /** @return the value of the {@code refPicList1EntryCount} field. */
    @NativeType("uint8_t")
    public byte refPicList1EntryCount() { return nrefPicList1EntryCount(address()); }
    /** @return the value of the {@code refList0ModOpCount} field. */
    @NativeType("uint8_t")
    public byte refList0ModOpCount() { return nrefList0ModOpCount(address()); }
    /** @return the value of the {@code refList1ModOpCount} field. */
    @NativeType("uint8_t")
    public byte refList1ModOpCount() { return nrefList1ModOpCount(address()); }
    /** @return the value of the {@code refPicMarkingOpCount} field. */
    @NativeType("uint8_t")
    public byte refPicMarkingOpCount() { return nrefPicMarkingOpCount(address()); }
    /** @return a {@link ByteBuffer} view of the {@code reserved1} field. */
    @NativeType("uint8_t[7]")
    public ByteBuffer reserved1() { return nreserved1(address()); }
    /** @return the value at the specified index of the {@code reserved1} field. */
    @NativeType("uint8_t")
    public byte reserved1(int index) { return nreserved1(address(), index); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pRefPicList0Entries} field. */
    @NativeType("uint8_t const *")
    public ByteBuffer pRefPicList0Entries() { return npRefPicList0Entries(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pRefPicList1Entries} field. */
    @NativeType("uint8_t const *")
    public ByteBuffer pRefPicList1Entries() { return npRefPicList1Entries(address()); }
    /** @return a {@link StdVideoEncodeH264RefListModEntry.Buffer} view of the struct array pointed to by the {@code pRefList0ModOperations} field. */
    @Nullable
    @NativeType("StdVideoEncodeH264RefListModEntry const *")
    public StdVideoEncodeH264RefListModEntry.Buffer pRefList0ModOperations() { return npRefList0ModOperations(address()); }
    /** @return a {@link StdVideoEncodeH264RefListModEntry.Buffer} view of the struct array pointed to by the {@code pRefList1ModOperations} field. */
    @Nullable
    @NativeType("StdVideoEncodeH264RefListModEntry const *")
    public StdVideoEncodeH264RefListModEntry.Buffer pRefList1ModOperations() { return npRefList1ModOperations(address()); }
    /** @return a {@link StdVideoEncodeH264RefPicMarkingEntry.Buffer} view of the struct array pointed to by the {@code pRefPicMarkingOperations} field. */
    @NativeType("StdVideoEncodeH264RefPicMarkingEntry const *")
    public StdVideoEncodeH264RefPicMarkingEntry.Buffer pRefPicMarkingOperations() { return npRefPicMarkingOperations(address()); }

    /** Copies the specified {@link StdVideoEncodeH264ReferenceListsInfoFlags} to the {@code flags} field. */
    public StdVideoEncodeH264ReferenceListsInfo flags(StdVideoEncodeH264ReferenceListsInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH264ReferenceListsInfo flags(java.util.function.Consumer<StdVideoEncodeH264ReferenceListsInfoFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code refList0ModOpCount} field. */
    public StdVideoEncodeH264ReferenceListsInfo refList0ModOpCount(@NativeType("uint8_t") byte value) { nrefList0ModOpCount(address(), value); return this; }
    /** Sets the specified value to the {@code refList1ModOpCount} field. */
    public StdVideoEncodeH264ReferenceListsInfo refList1ModOpCount(@NativeType("uint8_t") byte value) { nrefList1ModOpCount(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code reserved1} field. */
    public StdVideoEncodeH264ReferenceListsInfo reserved1(@NativeType("uint8_t[7]") ByteBuffer value) { nreserved1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved1} field. */
    public StdVideoEncodeH264ReferenceListsInfo reserved1(int index, @NativeType("uint8_t") byte value) { nreserved1(address(), index, value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pRefPicList0Entries} field. */
    public StdVideoEncodeH264ReferenceListsInfo pRefPicList0Entries(@NativeType("uint8_t const *") ByteBuffer value) { npRefPicList0Entries(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pRefPicList1Entries} field. */
    public StdVideoEncodeH264ReferenceListsInfo pRefPicList1Entries(@NativeType("uint8_t const *") ByteBuffer value) { npRefPicList1Entries(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264RefListModEntry.Buffer} to the {@code pRefList0ModOperations} field. */
    public StdVideoEncodeH264ReferenceListsInfo pRefList0ModOperations(@Nullable @NativeType("StdVideoEncodeH264RefListModEntry const *") StdVideoEncodeH264RefListModEntry.Buffer value) { npRefList0ModOperations(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264RefListModEntry.Buffer} to the {@code pRefList1ModOperations} field. */
    public StdVideoEncodeH264ReferenceListsInfo pRefList1ModOperations(@Nullable @NativeType("StdVideoEncodeH264RefListModEntry const *") StdVideoEncodeH264RefListModEntry.Buffer value) { npRefList1ModOperations(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264RefPicMarkingEntry.Buffer} to the {@code pRefPicMarkingOperations} field. */
    public StdVideoEncodeH264ReferenceListsInfo pRefPicMarkingOperations(@NativeType("StdVideoEncodeH264RefPicMarkingEntry const *") StdVideoEncodeH264RefPicMarkingEntry.Buffer value) { npRefPicMarkingOperations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH264ReferenceListsInfo set(
        StdVideoEncodeH264ReferenceListsInfoFlags flags,
        byte refList0ModOpCount,
        byte refList1ModOpCount,
        ByteBuffer reserved1,
        ByteBuffer pRefPicList0Entries,
        ByteBuffer pRefPicList1Entries,
        @Nullable StdVideoEncodeH264RefListModEntry.Buffer pRefList0ModOperations,
        @Nullable StdVideoEncodeH264RefListModEntry.Buffer pRefList1ModOperations,
        StdVideoEncodeH264RefPicMarkingEntry.Buffer pRefPicMarkingOperations
    ) {
        flags(flags);
        refList0ModOpCount(refList0ModOpCount);
        refList1ModOpCount(refList1ModOpCount);
        reserved1(reserved1);
        pRefPicList0Entries(pRefPicList0Entries);
        pRefPicList1Entries(pRefPicList1Entries);
        pRefList0ModOperations(pRefList0ModOperations);
        pRefList1ModOperations(pRefList1ModOperations);
        pRefPicMarkingOperations(pRefPicMarkingOperations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH264ReferenceListsInfo set(StdVideoEncodeH264ReferenceListsInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH264ReferenceListsInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264ReferenceListsInfo malloc() {
        return wrap(StdVideoEncodeH264ReferenceListsInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH264ReferenceListsInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264ReferenceListsInfo calloc() {
        return wrap(StdVideoEncodeH264ReferenceListsInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH264ReferenceListsInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH264ReferenceListsInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoEncodeH264ReferenceListsInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH264ReferenceListsInfo} instance for the specified memory address. */
    public static StdVideoEncodeH264ReferenceListsInfo create(long address) {
        return wrap(StdVideoEncodeH264ReferenceListsInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264ReferenceListsInfo createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoEncodeH264ReferenceListsInfo.class, address);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceListsInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceListsInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceListsInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceListsInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceListsInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceListsInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoEncodeH264ReferenceListsInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceListsInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264ReferenceListsInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264ReferenceListsInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264ReferenceListsInfo malloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH264ReferenceListsInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoEncodeH264ReferenceListsInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264ReferenceListsInfo calloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH264ReferenceListsInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceListsInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceListsInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceListsInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceListsInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH264ReferenceListsInfoFlags nflags(long struct) { return StdVideoEncodeH264ReferenceListsInfoFlags.create(struct + StdVideoEncodeH264ReferenceListsInfo.FLAGS); }
    /** Unsafe version of {@link #refPicList0EntryCount}. */
    public static byte nrefPicList0EntryCount(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFPICLIST0ENTRYCOUNT); }
    /** Unsafe version of {@link #refPicList1EntryCount}. */
    public static byte nrefPicList1EntryCount(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFPICLIST1ENTRYCOUNT); }
    /** Unsafe version of {@link #refList0ModOpCount}. */
    public static byte nrefList0ModOpCount(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFLIST0MODOPCOUNT); }
    /** Unsafe version of {@link #refList1ModOpCount}. */
    public static byte nrefList1ModOpCount(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFLIST1MODOPCOUNT); }
    /** Unsafe version of {@link #refPicMarkingOpCount}. */
    public static byte nrefPicMarkingOpCount(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFPICMARKINGOPCOUNT); }
    /** Unsafe version of {@link #reserved1}. */
    public static ByteBuffer nreserved1(long struct) { return memByteBuffer(struct + StdVideoEncodeH264ReferenceListsInfo.RESERVED1, 7); }
    /** Unsafe version of {@link #reserved1(int) reserved1}. */
    public static byte nreserved1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.RESERVED1 + check(index, 7) * 1);
    }
    /** Unsafe version of {@link #pRefPicList0Entries() pRefPicList0Entries}. */
    public static ByteBuffer npRefPicList0Entries(long struct) { return memByteBuffer(memGetAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFPICLIST0ENTRIES), Byte.toUnsignedInt(nrefPicList0EntryCount(struct))); }
    /** Unsafe version of {@link #pRefPicList1Entries() pRefPicList1Entries}. */
    public static ByteBuffer npRefPicList1Entries(long struct) { return memByteBuffer(memGetAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFPICLIST1ENTRIES), Byte.toUnsignedInt(nrefPicList1EntryCount(struct))); }
    /** Unsafe version of {@link #pRefList0ModOperations}. */
    @Nullable public static StdVideoEncodeH264RefListModEntry.Buffer npRefList0ModOperations(long struct) { return StdVideoEncodeH264RefListModEntry.createSafe(memGetAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFLIST0MODOPERATIONS), Byte.toUnsignedInt(nrefList0ModOpCount(struct))); }
    /** Unsafe version of {@link #pRefList1ModOperations}. */
    @Nullable public static StdVideoEncodeH264RefListModEntry.Buffer npRefList1ModOperations(long struct) { return StdVideoEncodeH264RefListModEntry.createSafe(memGetAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFLIST1MODOPERATIONS), Byte.toUnsignedInt(nrefList1ModOpCount(struct))); }
    /** Unsafe version of {@link #pRefPicMarkingOperations}. */
    public static StdVideoEncodeH264RefPicMarkingEntry.Buffer npRefPicMarkingOperations(long struct) { return StdVideoEncodeH264RefPicMarkingEntry.create(memGetAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFPICMARKINGOPERATIONS), Byte.toUnsignedInt(nrefPicMarkingOpCount(struct))); }

    /** Unsafe version of {@link #flags(StdVideoEncodeH264ReferenceListsInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH264ReferenceListsInfoFlags value) { memCopy(value.address(), struct + StdVideoEncodeH264ReferenceListsInfo.FLAGS, StdVideoEncodeH264ReferenceListsInfoFlags.SIZEOF); }
    /** Sets the specified value to the {@code refPicList0EntryCount} field of the specified {@code struct}. */
    public static void nrefPicList0EntryCount(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFPICLIST0ENTRYCOUNT, value); }
    /** Sets the specified value to the {@code refPicList1EntryCount} field of the specified {@code struct}. */
    public static void nrefPicList1EntryCount(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFPICLIST1ENTRYCOUNT, value); }
    /** Sets the specified value to the {@code refList0ModOpCount} field of the specified {@code struct}. */
    public static void nrefList0ModOpCount(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFLIST0MODOPCOUNT, value); }
    /** Sets the specified value to the {@code refList1ModOpCount} field of the specified {@code struct}. */
    public static void nrefList1ModOpCount(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFLIST1MODOPCOUNT, value); }
    /** Sets the specified value to the {@code refPicMarkingOpCount} field of the specified {@code struct}. */
    public static void nrefPicMarkingOpCount(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFPICMARKINGOPCOUNT, value); }
    /** Unsafe version of {@link #reserved1(ByteBuffer) reserved1}. */
    public static void nreserved1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 7); }
        memCopy(memAddress(value), struct + StdVideoEncodeH264ReferenceListsInfo.RESERVED1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #reserved1(int, byte) reserved1}. */
    public static void nreserved1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.RESERVED1 + check(index, 7) * 1, value);
    }
    /** Unsafe version of {@link #pRefPicList0Entries(ByteBuffer) pRefPicList0Entries}. */
    public static void npRefPicList0Entries(long struct, ByteBuffer value) { memPutAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFPICLIST0ENTRIES, memAddress(value)); nrefPicList0EntryCount(struct, (byte)value.remaining()); }
    /** Unsafe version of {@link #pRefPicList1Entries(ByteBuffer) pRefPicList1Entries}. */
    public static void npRefPicList1Entries(long struct, ByteBuffer value) { memPutAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFPICLIST1ENTRIES, memAddress(value)); nrefPicList1EntryCount(struct, (byte)value.remaining()); }
    /** Unsafe version of {@link #pRefList0ModOperations(StdVideoEncodeH264RefListModEntry.Buffer) pRefList0ModOperations}. */
    public static void npRefList0ModOperations(long struct, @Nullable StdVideoEncodeH264RefListModEntry.Buffer value) { memPutAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFLIST0MODOPERATIONS, memAddressSafe(value)); nrefList0ModOpCount(struct, value == null ? 0 : (byte)value.remaining()); }
    /** Unsafe version of {@link #pRefList1ModOperations(StdVideoEncodeH264RefListModEntry.Buffer) pRefList1ModOperations}. */
    public static void npRefList1ModOperations(long struct, @Nullable StdVideoEncodeH264RefListModEntry.Buffer value) { memPutAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFLIST1MODOPERATIONS, memAddressSafe(value)); nrefList1ModOpCount(struct, value == null ? 0 : (byte)value.remaining()); }
    /** Unsafe version of {@link #pRefPicMarkingOperations(StdVideoEncodeH264RefPicMarkingEntry.Buffer) pRefPicMarkingOperations}. */
    public static void npRefPicMarkingOperations(long struct, StdVideoEncodeH264RefPicMarkingEntry.Buffer value) { memPutAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFPICMARKINGOPERATIONS, value.address()); nrefPicMarkingOpCount(struct, (byte)value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFPICLIST0ENTRIES));
        check(memGetAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFPICLIST1ENTRIES));
        check(memGetAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFPICMARKINGOPERATIONS));
    }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH264ReferenceListsInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264ReferenceListsInfo, Buffer> implements NativeResource {

        private static final StdVideoEncodeH264ReferenceListsInfo ELEMENT_FACTORY = StdVideoEncodeH264ReferenceListsInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH264ReferenceListsInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH264ReferenceListsInfo#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoEncodeH264ReferenceListsInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeH264ReferenceListsInfoFlags} view of the {@code flags} field. */
        public StdVideoEncodeH264ReferenceListsInfoFlags flags() { return StdVideoEncodeH264ReferenceListsInfo.nflags(address()); }
        /** @return the value of the {@code refPicList0EntryCount} field. */
        @NativeType("uint8_t")
        public byte refPicList0EntryCount() { return StdVideoEncodeH264ReferenceListsInfo.nrefPicList0EntryCount(address()); }
        /** @return the value of the {@code refPicList1EntryCount} field. */
        @NativeType("uint8_t")
        public byte refPicList1EntryCount() { return StdVideoEncodeH264ReferenceListsInfo.nrefPicList1EntryCount(address()); }
        /** @return the value of the {@code refList0ModOpCount} field. */
        @NativeType("uint8_t")
        public byte refList0ModOpCount() { return StdVideoEncodeH264ReferenceListsInfo.nrefList0ModOpCount(address()); }
        /** @return the value of the {@code refList1ModOpCount} field. */
        @NativeType("uint8_t")
        public byte refList1ModOpCount() { return StdVideoEncodeH264ReferenceListsInfo.nrefList1ModOpCount(address()); }
        /** @return the value of the {@code refPicMarkingOpCount} field. */
        @NativeType("uint8_t")
        public byte refPicMarkingOpCount() { return StdVideoEncodeH264ReferenceListsInfo.nrefPicMarkingOpCount(address()); }
        /** @return a {@link ByteBuffer} view of the {@code reserved1} field. */
        @NativeType("uint8_t[7]")
        public ByteBuffer reserved1() { return StdVideoEncodeH264ReferenceListsInfo.nreserved1(address()); }
        /** @return the value at the specified index of the {@code reserved1} field. */
        @NativeType("uint8_t")
        public byte reserved1(int index) { return StdVideoEncodeH264ReferenceListsInfo.nreserved1(address(), index); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pRefPicList0Entries} field. */
        @NativeType("uint8_t const *")
        public ByteBuffer pRefPicList0Entries() { return StdVideoEncodeH264ReferenceListsInfo.npRefPicList0Entries(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pRefPicList1Entries} field. */
        @NativeType("uint8_t const *")
        public ByteBuffer pRefPicList1Entries() { return StdVideoEncodeH264ReferenceListsInfo.npRefPicList1Entries(address()); }
        /** @return a {@link StdVideoEncodeH264RefListModEntry.Buffer} view of the struct array pointed to by the {@code pRefList0ModOperations} field. */
        @Nullable
        @NativeType("StdVideoEncodeH264RefListModEntry const *")
        public StdVideoEncodeH264RefListModEntry.Buffer pRefList0ModOperations() { return StdVideoEncodeH264ReferenceListsInfo.npRefList0ModOperations(address()); }
        /** @return a {@link StdVideoEncodeH264RefListModEntry.Buffer} view of the struct array pointed to by the {@code pRefList1ModOperations} field. */
        @Nullable
        @NativeType("StdVideoEncodeH264RefListModEntry const *")
        public StdVideoEncodeH264RefListModEntry.Buffer pRefList1ModOperations() { return StdVideoEncodeH264ReferenceListsInfo.npRefList1ModOperations(address()); }
        /** @return a {@link StdVideoEncodeH264RefPicMarkingEntry.Buffer} view of the struct array pointed to by the {@code pRefPicMarkingOperations} field. */
        @NativeType("StdVideoEncodeH264RefPicMarkingEntry const *")
        public StdVideoEncodeH264RefPicMarkingEntry.Buffer pRefPicMarkingOperations() { return StdVideoEncodeH264ReferenceListsInfo.npRefPicMarkingOperations(address()); }

        /** Copies the specified {@link StdVideoEncodeH264ReferenceListsInfoFlags} to the {@code flags} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer flags(StdVideoEncodeH264ReferenceListsInfoFlags value) { StdVideoEncodeH264ReferenceListsInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer flags(java.util.function.Consumer<StdVideoEncodeH264ReferenceListsInfoFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code refList0ModOpCount} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer refList0ModOpCount(@NativeType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.nrefList0ModOpCount(address(), value); return this; }
        /** Sets the specified value to the {@code refList1ModOpCount} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer refList1ModOpCount(@NativeType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.nrefList1ModOpCount(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code reserved1} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer reserved1(@NativeType("uint8_t[7]") ByteBuffer value) { StdVideoEncodeH264ReferenceListsInfo.nreserved1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved1} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer reserved1(int index, @NativeType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.nreserved1(address(), index, value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pRefPicList0Entries} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer pRefPicList0Entries(@NativeType("uint8_t const *") ByteBuffer value) { StdVideoEncodeH264ReferenceListsInfo.npRefPicList0Entries(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pRefPicList1Entries} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer pRefPicList1Entries(@NativeType("uint8_t const *") ByteBuffer value) { StdVideoEncodeH264ReferenceListsInfo.npRefPicList1Entries(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264RefListModEntry.Buffer} to the {@code pRefList0ModOperations} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer pRefList0ModOperations(@Nullable @NativeType("StdVideoEncodeH264RefListModEntry const *") StdVideoEncodeH264RefListModEntry.Buffer value) { StdVideoEncodeH264ReferenceListsInfo.npRefList0ModOperations(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264RefListModEntry.Buffer} to the {@code pRefList1ModOperations} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer pRefList1ModOperations(@Nullable @NativeType("StdVideoEncodeH264RefListModEntry const *") StdVideoEncodeH264RefListModEntry.Buffer value) { StdVideoEncodeH264ReferenceListsInfo.npRefList1ModOperations(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264RefPicMarkingEntry.Buffer} to the {@code pRefPicMarkingOperations} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer pRefPicMarkingOperations(@NativeType("StdVideoEncodeH264RefPicMarkingEntry const *") StdVideoEncodeH264RefPicMarkingEntry.Buffer value) { StdVideoEncodeH264ReferenceListsInfo.npRefPicMarkingOperations(address(), value); return this; }

    }

}