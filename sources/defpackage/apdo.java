package defpackage;

import java.io.DataOutput;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: apdo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apdo {
    public static apdl a(annh annh, apdl apdl, apdv apdv) {
        boolean z;
        boolean z2;
        int intValue;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        short readShort = annh.readShort();
        int i = 0;
        boolean z7 = (readShort & 4096) != 0;
        short s = readShort & 4095;
        apdk apdk = (apdk) apdk.r.get(Short.valueOf((short) s));
        amrl.a((Object) apdk, "Unknown chunk type: %s", (int) s);
        int ordinal = apdk.ordinal();
        if (ordinal == 1) {
            amrl.b(z7);
            apds apds = new apds(annh, apdl);
            int[] iArr = new int[apds.e];
            apdr apdr = new apdr(annh, apds.d().c);
            TreeSet<Integer> treeSet = new TreeSet<>();
            int nextSetBit = apdv.a.nextSetBit(0);
            while (nextSetBit >= 0) {
                treeSet.add(Integer.valueOf(nextSetBit));
                nextSetBit = apdv.a.nextSetBit(nextSetBit + 1);
            }
            int i2 = 0;
            for (Integer intValue2 : treeSet) {
                int intValue3 = intValue2.intValue();
                apdr.a(intValue3 - i2);
                while (i2 < intValue3) {
                    iArr[i2] = -1;
                    i2++;
                }
                if (i2 == intValue3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                amrl.b(z3);
                List list = apds.g;
                apdr.a();
                short s2 = apdr.c.getShort();
                String str = new String(apdr.c.array(), apdr.c.position(), s2, apdr.b);
                ByteBuffer byteBuffer = apdr.c;
                byteBuffer.position(byteBuffer.position() + s2);
                list.add(str);
                iArr[i2] = apds.g.size() - 1;
                i2++;
            }
            apdr.a(apds.e - i2);
            amrl.b(!apdr.c.hasRemaining());
            if (apdr.a.readInt() == 0) {
                z = true;
            } else {
                z = false;
            }
            amrl.b(z);
            while (i2 < apds.e) {
                iArr[i2] = -1;
                i2++;
            }
            byte[] bArr = new byte[annh.readInt()];
            anmr.a((InputStream) annh, bArr);
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            int i3 = 0;
            while (it.hasNext() && (intValue = ((Integer) it.next()).intValue()) < apds.f) {
                for (int i4 = intValue - i3; i4 > 0; i4--) {
                    apeh.a(order, apds);
                }
                arrayList.add(apeh.a(order, apds));
                i3 = intValue + 1;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                apeh apeh = (apeh) arrayList.get(i5);
                ArrayList arrayList3 = new ArrayList(apeh.a().size());
                for (apeg apeg : apeh.a()) {
                    int i6 = iArr[apeg.a()];
                    if (i6 >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    amrl.a(z2);
                    arrayList3.add(new apdh(i6, apeg.b(), apeg.c(), apeg.d()));
                }
                arrayList2.add(apeh.a(Collections.unmodifiableList(arrayList3)));
            }
            apds.h = arrayList2;
            return apds;
        } else if (ordinal != 2) {
            switch (ordinal) {
                case 10:
                    amrl.b(z7);
                    apdp apdp = new apdp(annh, apdl);
                    annh.readInt();
                    apdp.f = a(annh, false);
                    apdp.g = a(annh, false);
                    List list2 = apdv.b;
                    int size2 = list2.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size2; i8++) {
                        int intValue4 = ((Integer) list2.get(i8)).intValue();
                        if (intValue4 >= i7) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        amrl.b(z4);
                        int i9 = intValue4 - i7;
                        while (i9 > 0) {
                            i9 -= annh.skipBytes(i9);
                        }
                        apdl a = a(annh, (apdl) apdp, apdv);
                        apdp.e.put(Integer.valueOf(apdp.d + apdp.b + intValue4), a);
                        i7 = a.c + intValue4;
                    }
                    return apdp;
                case 11:
                    if (z7) {
                        apdt apdt = new apdt(annh, apdl);
                        byte[] bArr2 = new byte[(apdt.c - apdt.b)];
                        anmr.a((InputStream) annh, bArr2);
                        ByteBuffer order2 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                        int i10 = order2.getInt();
                        int a2 = arbl.a(order2);
                        ArrayList arrayList4 = new ArrayList();
                        for (int i11 = 0; i11 < a2; i11++) {
                            arrayList4.add(Integer.valueOf(arbl.a(order2)));
                        }
                        int i12 = 0;
                        int i13 = 0;
                        int i14 = 0;
                        while (i12 < arrayList4.size()) {
                            int intValue5 = ((Integer) arrayList4.get(i12)).intValue();
                            if (intValue5 == -3) {
                                i12++;
                                intValue5 = ((Integer) arrayList4.get(i12)).intValue();
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (intValue5 != 0) {
                                if (intValue5 == -2) {
                                    intValue5 = 0;
                                }
                                i12++;
                                if (i12 < arrayList4.size()) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                amrl.b(z6);
                                i14 += ((Integer) arrayList4.get(i12)).intValue();
                                aped d = apef.d();
                                d.a(intValue5);
                                d.b(8);
                                d.a(!z5 ? apee.STRING : apee.REFERENCE);
                                apef a3 = d.a();
                                apej i15 = apek.i();
                                i15.a(i10);
                                i15.b(8);
                                i15.c(i14);
                                i15.c = apdt;
                                i15.e(i13);
                                i15.a = a3;
                                i15.d(0);
                                i15.b = new LinkedHashMap();
                                apek a4 = i15.a();
                                Map map = apdt.g;
                                Integer valueOf = Integer.valueOf(i13);
                                amrl.b(!map.containsKey(valueOf));
                                apdt.g.put(valueOf, a4);
                            }
                            i13++;
                            i12++;
                        }
                        return apdt;
                    }
                    ByteBuffer a5 = a(annh);
                    apel apel = new apel(a5, apdl);
                    int i16 = apel.d + apel.f;
                    if (!apel.d()) {
                        while (i < apel.e) {
                            int i17 = a5.getInt();
                            if (i17 != -1) {
                                apel.g.put(Integer.valueOf(i), apek.a(a5, i17 + i16, apel, i));
                            }
                            i++;
                        }
                        return apel;
                    }
                    while (i < apel.e) {
                        char c = (char) a5.getShort();
                        apel.g.put(Integer.valueOf(c), apek.a(a5, (((char) a5.getShort()) * 4) + i16, apel, c));
                        i++;
                    }
                    return apel;
                case 12:
                    amrl.b(!z7);
                    return new apdu(annh, apdl);
                default:
                    throw new IllegalStateException("We don't support compressed XML resources yet");
            }
        } else {
            amrl.b(z7);
            apdq apdq = new apdq(annh, apdl);
            Map map2 = apdq.e;
            int readInt = annh.readInt();
            while (i < readInt) {
                map2.put(Integer.valueOf(apdq.d + i), a(annh, (apdl) apdq, apdv));
                i++;
            }
            apdq.g.clear();
            for (apdl apdl2 : apdq.e.values()) {
                if (apdl2 instanceof apdw) {
                    apdw apdw = (apdw) apdl2;
                    apdq.g.put(apdw.h, apdw);
                } else if (apdl2 instanceof apei) {
                    apdq.f = (apei) apdl2;
                }
            }
            amrl.a((Object) apdq.f, (Object) "ResourceTableChunk must have a string pool.");
            return apdq;
        }
    }

    static ByteBuffer b(annh annh) {
        byte[] bArr = new byte[6];
        anmr.a((InputStream) annh, bArr);
        short s = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort();
        byte[] copyOf = Arrays.copyOf(bArr, s);
        anmr.a(annh, copyOf, 6, s - 8);
        return ByteBuffer.wrap(copyOf).order(ByteOrder.LITTLE_ENDIAN);
    }

    static ByteBuffer a(annh annh) {
        return ByteBuffer.wrap(a(annh, true)).order(ByteOrder.LITTLE_ENDIAN);
    }

    static ByteBuffer a(annh annh, int i) {
        byte[] bArr = new byte[i];
        anmr.a((InputStream) annh, bArr);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
    }

    static Map a(DataOutput dataOutput, Collection collection, boolean z) {
        if (z) {
            dataOutput.writeInt(collection.size());
        }
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            apdl apdl = (apdl) it.next();
            byte[] c = apdl.c();
            dataOutput.write(c);
            apdl.a(dataOutput, c.length);
            hashMap.put(apdl, Integer.valueOf(i));
            i++;
        }
        return hashMap;
    }

    static byte[] a(annh annh, boolean z) {
        int i;
        if (!z) {
            i = 8;
        } else {
            i = 6;
        }
        byte[] bArr = new byte[i];
        anmr.a((InputStream) annh, bArr);
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        for (int i2 = 0; i2 < i - 4; i2++) {
            order.get();
        }
        int i3 = order.getInt();
        byte[] copyOf = Arrays.copyOf(bArr, z ? i3 - 2 : i3);
        anmr.a(annh, copyOf, i, i3 - 8);
        return copyOf;
    }
}
