package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ExperimentTokens extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ydx();
    public static final ExperimentTokens a;
    private static final byte[][] k = new byte[0][];
    private static final ydw l = new yds();
    private static final ydw m = new ydt();
    private static final ydw n = new ydu();
    private static final ydw o = new ydv();
    public final String b;
    public final byte[] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final byte[][] g;
    public final int[] h;
    public final byte[][] i;
    public final int[] j;

    static {
        byte[][] bArr = k;
        a = new ExperimentTokens("", (byte[]) null, bArr, bArr, bArr, bArr, (int[]) null, (byte[][]) null, (int[]) null);
    }

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2) {
        this.b = str;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
        this.g = bArr5;
        this.h = iArr;
        this.i = bArr6;
        this.j = iArr2;
    }

    public static int a(byte[][] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i2 = 0;
        for (byte[] bArr2 : bArr) {
            if (bArr2 != null) {
                i2 += bArr2.length;
            }
        }
        return i2;
    }

    private static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i2 = 0; i2 < iArr.length; i2 += 2) {
            arrayList.add(new GenericDimension(iArr[i2], iArr[i2 + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int[] c(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        if (readInt == 0) {
            return null;
        }
        int[] iArr = new int[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            iArr[i2] = dataInputStream.readInt();
        }
        return iArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (!yez.a(this.b, experimentTokens.b) || !Arrays.equals(this.c, experimentTokens.c) || !yez.a(b(this.d), b(experimentTokens.d)) || !yez.a(b(this.e), b(experimentTokens.e)) || !yez.a(b(this.f), b(experimentTokens.f)) || !yez.a(b(this.g), b(experimentTokens.g)) || !yez.a(a(this.h), a(experimentTokens.h)) || !yez.a(b(this.i), b(experimentTokens.i)) || !yez.a(b(this.j), b(experimentTokens.j))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str2 = this.b;
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder(str2.length() + 2);
            sb2.append("'");
            sb2.append(str2);
            sb2.append("'");
            str = sb2.toString();
        } else {
            str = "null";
        }
        sb.append(str);
        byte[] bArr = this.c;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        a(sb, "GAIA=", this.d);
        sb.append(", ");
        a(sb, "PSEUDO=", this.e);
        sb.append(", ");
        a(sb, "ALWAYS=", this.f);
        sb.append(", ");
        a(sb, "OTHER=", this.g);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.h));
        sb.append(", ");
        a(sb, "directs=", this.i);
        sb.append(", genDims=");
        sb.append(Arrays.toString(b(this.j).toArray()));
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h, false);
        ivx.a(parcel, 9, this.i);
        ivx.a(parcel, 10, this.j, false);
        ivx.b(parcel, a2);
    }

    public static ExperimentTokens a(String str) {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
        try {
            int readInt = dataInputStream.readInt();
            if (readInt != 1) {
                if (readInt != 2) {
                    StringBuilder sb = new StringBuilder(30);
                    sb.append("Unexpected version ");
                    sb.append(readInt);
                    throw new RuntimeException(sb.toString());
                }
            }
            return new ExperimentTokens(dataInputStream.readUTF(), a(dataInputStream), b(dataInputStream), b(dataInputStream), b(dataInputStream), b(dataInputStream), c(dataInputStream), b(dataInputStream), readInt >= 2 ? c(dataInputStream) : null);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r1.length;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final int[] c(int[] r1) {
        /*
            if (r1 == 0) goto L_0x0009
            int r0 = r1.length
            if (r0 == 0) goto L_0x0009
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
        L_0x0009:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.ExperimentTokens.c(int[]):int[]");
    }

    private static List b(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(r0);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static final byte[][] c(byte[][] bArr) {
        int length;
        int length2;
        if (bArr == null || (length = bArr.length) == 0) {
            return bArr;
        }
        byte[][] bArr2 = new byte[length][];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte[] bArr3 = bArr[i2];
            if (bArr3 == null || (length2 = bArr3.length) == 0) {
                bArr2[i2] = bArr3;
            } else {
                bArr2[i2] = Arrays.copyOf(bArr3, length2);
            }
        }
        return bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.phenotype.ExperimentTokens a(java.util.List r18) {
        /*
            r0 = r18
            int r1 = r18.size()
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L_0x0147
            com.google.android.gms.phenotype.ExperimentTokens r1 = new com.google.android.gms.phenotype.ExperimentTokens
            boolean r2 = r18.isEmpty()
            if (r2 != 0) goto L_0x0034
            java.lang.Object r2 = r0.get(r3)
            com.google.android.gms.phenotype.ExperimentTokens r2 = (com.google.android.gms.phenotype.ExperimentTokens) r2
            java.lang.String r2 = r2.b
            int r4 = r18.size()
            r5 = 0
        L_0x001f:
            if (r5 >= r4) goto L_0x0034
            int r6 = r5 + 1
            java.lang.Object r5 = r0.get(r5)
            com.google.android.gms.phenotype.ExperimentTokens r5 = (com.google.android.gms.phenotype.ExperimentTokens) r5
            java.lang.String r5 = r5.b
            boolean r5 = defpackage.yez.a(r2, r5)
            if (r5 != 0) goto L_0x0032
            goto L_0x0044
        L_0x0032:
            r5 = r6
            goto L_0x001f
        L_0x0034:
            boolean r2 = r18.isEmpty()
            if (r2 != 0) goto L_0x0044
            java.lang.Object r2 = r0.get(r3)
            com.google.android.gms.phenotype.ExperimentTokens r2 = (com.google.android.gms.phenotype.ExperimentTokens) r2
            java.lang.String r2 = r2.b
            r5 = r2
            goto L_0x0047
        L_0x0044:
            java.lang.String r2 = ""
            r5 = r2
        L_0x0047:
            ydw r2 = l
            byte[][] r7 = a((java.util.List) r0, (defpackage.ydw) r2)
            ydw r2 = m
            byte[][] r8 = a((java.util.List) r0, (defpackage.ydw) r2)
            ydw r2 = n
            byte[][] r9 = a((java.util.List) r0, (defpackage.ydw) r2)
            ydw r2 = o
            byte[][] r10 = a((java.util.List) r0, (defpackage.ydw) r2)
            int r2 = r18.size()
            r4 = 0
            r6 = 0
        L_0x0065:
            if (r4 < r2) goto L_0x0133
            int[] r11 = new int[r6]
            int r12 = r18.size()
            r2 = 0
            r4 = 0
        L_0x006f:
            if (r2 < r12) goto L_0x0113
            int r6 = r18.size()
            r2 = 0
            r4 = 0
        L_0x0077:
            if (r2 < r6) goto L_0x00f7
            byte[][] r12 = new byte[r4][]
            int r13 = r18.size()
            r2 = 0
            r4 = 0
        L_0x0081:
            if (r2 < r13) goto L_0x00cd
            int r6 = r18.size()
            r2 = 0
            r4 = 0
        L_0x0089:
            if (r2 < r6) goto L_0x00ba
            int[] r13 = new int[r4]
            int r2 = r18.size()
            r4 = 0
            r6 = 0
        L_0x0093:
            if (r4 >= r2) goto L_0x00b4
            java.lang.Object r14 = r0.get(r4)
            com.google.android.gms.phenotype.ExperimentTokens r14 = (com.google.android.gms.phenotype.ExperimentTokens) r14
            if (r14 != 0) goto L_0x009e
            goto L_0x00b0
        L_0x009e:
            int[] r14 = r14.j
            if (r14 == 0) goto L_0x00b0
            int r15 = r14.length
        L_0x00a3:
            if (r3 >= r15) goto L_0x00b0
            int r16 = r6 + 1
            r17 = r14[r3]
            r13[r6] = r17
            int r3 = r3 + 1
            r6 = r16
            goto L_0x00a3
        L_0x00b0:
            int r4 = r4 + 1
            r3 = 0
            goto L_0x0093
        L_0x00b4:
            r6 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r1
        L_0x00ba:
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.phenotype.ExperimentTokens r3 = (com.google.android.gms.phenotype.ExperimentTokens) r3
            if (r3 != 0) goto L_0x00c3
        L_0x00c2:
            goto L_0x00c9
        L_0x00c3:
            int[] r3 = r3.j
            if (r3 == 0) goto L_0x00c2
            int r3 = r3.length
            int r4 = r4 + r3
        L_0x00c9:
            int r2 = r2 + 1
            r3 = 0
            goto L_0x0089
        L_0x00cd:
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.phenotype.ExperimentTokens r3 = (com.google.android.gms.phenotype.ExperimentTokens) r3
            if (r3 == 0) goto L_0x00de
            byte[] r6 = r3.c
            if (r6 == 0) goto L_0x00de
            int r14 = r4 + 1
            r12[r4] = r6
            r4 = r14
        L_0x00de:
            if (r3 != 0) goto L_0x00e1
            goto L_0x00f3
        L_0x00e1:
            byte[][] r3 = r3.i
            if (r3 == 0) goto L_0x00f3
            int r6 = r3.length
            r14 = 0
        L_0x00e7:
            if (r14 >= r6) goto L_0x00f3
            int r15 = r4 + 1
            r16 = r3[r14]
            r12[r4] = r16
            int r14 = r14 + 1
            r4 = r15
            goto L_0x00e7
        L_0x00f3:
            int r2 = r2 + 1
            r3 = 0
            goto L_0x0081
        L_0x00f7:
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.phenotype.ExperimentTokens r3 = (com.google.android.gms.phenotype.ExperimentTokens) r3
            if (r3 == 0) goto L_0x0105
            byte[] r12 = r3.c
            if (r12 == 0) goto L_0x0105
            int r4 = r4 + 1
        L_0x0105:
            if (r3 != 0) goto L_0x0108
        L_0x0107:
            goto L_0x010e
        L_0x0108:
            byte[][] r3 = r3.i
            if (r3 == 0) goto L_0x0107
            int r3 = r3.length
            int r4 = r4 + r3
        L_0x010e:
            int r2 = r2 + 1
            r3 = 0
            goto L_0x0077
        L_0x0113:
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.phenotype.ExperimentTokens r3 = (com.google.android.gms.phenotype.ExperimentTokens) r3
            if (r3 != 0) goto L_0x011c
            goto L_0x012e
        L_0x011c:
            int[] r3 = r3.h
            if (r3 == 0) goto L_0x012e
            int r6 = r3.length
            r13 = 0
        L_0x0122:
            if (r13 >= r6) goto L_0x012e
            int r14 = r4 + 1
            r15 = r3[r13]
            r11[r4] = r15
            int r13 = r13 + 1
            r4 = r14
            goto L_0x0122
        L_0x012e:
            int r2 = r2 + 1
            r3 = 0
            goto L_0x006f
        L_0x0133:
            java.lang.Object r3 = r0.get(r4)
            com.google.android.gms.phenotype.ExperimentTokens r3 = (com.google.android.gms.phenotype.ExperimentTokens) r3
            if (r3 != 0) goto L_0x013c
        L_0x013b:
            goto L_0x0142
        L_0x013c:
            int[] r3 = r3.h
            if (r3 == 0) goto L_0x013b
            int r3 = r3.length
            int r6 = r6 + r3
        L_0x0142:
            int r4 = r4 + 1
            r3 = 0
            goto L_0x0065
        L_0x0147:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.phenotype.ExperimentTokens r0 = (com.google.android.gms.phenotype.ExperimentTokens) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.ExperimentTokens.a(java.util.List):com.google.android.gms.phenotype.ExperimentTokens");
    }

    private static byte[][] b(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        if (readInt == 0) {
            return null;
        }
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = a(dataInputStream);
        }
        return bArr;
    }

    public final String b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeUTF(this.b);
            a(this.c, dataOutputStream);
            a(this.d, dataOutputStream);
            a(this.e, dataOutputStream);
            a(this.f, dataOutputStream);
            a(this.g, dataOutputStream);
            a(this.h, dataOutputStream);
            a(this.i, dataOutputStream);
            a(this.j, dataOutputStream);
            dataOutputStream.flush();
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            try {
                dataOutputStream.close();
                return encodeToString;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
                throw th;
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    private static List a(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(r0);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void a(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        int length = bArr.length;
        boolean z = true;
        int i2 = 0;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i2++;
            z = false;
        }
        sb.append(")");
    }

    private static final void a(byte[] bArr, DataOutputStream dataOutputStream) {
        if (bArr != null) {
            int length = bArr.length;
            dataOutputStream.writeInt(length);
            dataOutputStream.write(bArr, 0, length);
            return;
        }
        dataOutputStream.writeInt(0);
    }

    private static final void a(int[] iArr, DataOutputStream dataOutputStream) {
        if (iArr != null) {
            dataOutputStream.writeInt(iArr.length);
            for (int writeInt : iArr) {
                dataOutputStream.writeInt(writeInt);
            }
            return;
        }
        dataOutputStream.writeInt(0);
    }

    private static final void a(byte[][] bArr, DataOutputStream dataOutputStream) {
        if (bArr != null) {
            dataOutputStream.writeInt(bArr.length);
            for (byte[] a2 : bArr) {
                a(a2, dataOutputStream);
            }
            return;
        }
        dataOutputStream.writeInt(0);
    }

    private static byte[] a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        if (readInt == 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        dataInputStream.readFully(bArr);
        return bArr;
    }

    private static byte[][] a(List list, ydw ydw) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ExperimentTokens experimentTokens = (ExperimentTokens) list.get(i3);
            if (!(experimentTokens == null || ydw.a(experimentTokens) == null)) {
                i2 += ydw.a(experimentTokens).length;
            }
        }
        byte[][] bArr = new byte[i2][];
        int size2 = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            ExperimentTokens experimentTokens2 = (ExperimentTokens) list.get(i5);
            if (!(experimentTokens2 == null || ydw.a(experimentTokens2) == null)) {
                byte[][] a2 = ydw.a(experimentTokens2);
                int length = a2.length;
                int i6 = 0;
                while (i6 < length) {
                    bArr[i4] = a2[i6];
                    i6++;
                    i4++;
                }
            }
        }
        return bArr;
    }

    public final ExperimentTokens a() {
        byte[] bArr;
        int length;
        String str = this.b;
        byte[] bArr2 = this.c;
        if (bArr2 == null || (length = bArr2.length) == 0) {
            bArr = bArr2;
        } else {
            bArr = Arrays.copyOf(bArr2, length);
        }
        return new ExperimentTokens(str, bArr, c(this.d), c(this.e), c(this.f), c(this.g), c(this.h), c(this.i), c(this.j));
    }
}
