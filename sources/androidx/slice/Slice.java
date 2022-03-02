package androidx.slice;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Slice extends CustomVersionedParcelable implements atq {
    static final String[] a = new String[0];
    static final SliceItem[] b = new SliceItem[0];
    public SliceSpec c;
    public SliceItem[] d;
    public String[] e;
    String f;

    public Slice() {
        this.c = null;
        this.d = b;
        this.e = a;
        this.f = null;
    }

    public static void a(StringBuilder sb, String[] strArr) {
        int length;
        if (strArr != null && (length = strArr.length) != 0) {
            sb.append('(');
            int i = length - 1;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(strArr[i2]);
                sb.append(", ");
            }
            sb.append(strArr[i]);
            sb.append(")");
        }
    }

    public final Uri b() {
        return Uri.parse(this.f);
    }

    public final List c() {
        return Arrays.asList(this.d);
    }

    public final List d() {
        return Arrays.asList(this.e);
    }

    public final String toString() {
        return a("");
    }

    public Slice(Bundle bundle) {
        SliceSpec sliceSpec = null;
        this.c = null;
        this.d = b;
        this.e = a;
        this.f = null;
        this.e = bundle.getStringArray("hints");
        Parcelable[] parcelableArray = bundle.getParcelableArray("items");
        this.d = new SliceItem[parcelableArray.length];
        int i = 0;
        while (true) {
            SliceItem[] sliceItemArr = this.d;
            if (i >= sliceItemArr.length) {
                break;
            }
            Parcelable parcelable = parcelableArray[i];
            if (parcelable instanceof Bundle) {
                sliceItemArr[i] = new SliceItem((Bundle) parcelable);
            }
            i++;
        }
        this.f = bundle.getParcelable("uri").toString();
        this.c = bundle.containsKey("type") ? new SliceSpec(bundle.getString("type"), bundle.getInt("revision")) : sliceSpec;
    }

    public Slice(ArrayList arrayList, String[] strArr, Uri uri, SliceSpec sliceSpec) {
        this.c = null;
        this.d = b;
        this.f = null;
        this.e = strArr;
        this.d = (SliceItem[]) arrayList.toArray(new SliceItem[arrayList.size()]);
        this.f = uri.toString();
        this.c = sliceSpec;
    }

    public static boolean a(IconCompat iconCompat) {
        if (iconCompat == null) {
            return false;
        }
        if (iconCompat.a != 2 || iconCompat.c() != 0) {
            return true;
        }
        throw new IllegalArgumentException("Failed to add icon, invalid resource id: " + iconCompat.c());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a() {
        /*
            r11 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String[] r1 = r11.e
            java.lang.String r2 = "hints"
            r0.putStringArray(r2, r1)
            androidx.slice.SliceItem[] r1 = r11.d
            int r1 = r1.length
            android.os.Parcelable[] r1 = new android.os.Parcelable[r1]
            r3 = 0
            r4 = 0
        L_0x0013:
            androidx.slice.SliceItem[] r5 = r11.d
            int r6 = r5.length
            java.lang.String r7 = "type"
            if (r4 >= r6) goto L_0x0146
            r5 = r5[r4]
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String[] r8 = r5.a
            r6.putStringArray(r2, r8)
            java.lang.String r8 = r5.b
            java.lang.String r9 = "format"
            r6.putString(r9, r8)
            java.lang.String r8 = r5.c
            java.lang.String r9 = "subtype"
            r6.putString(r9, r8)
            java.lang.Object r8 = r5.d
            java.lang.String r5 = r5.b
            int r9 = r5.hashCode()
            switch(r9) {
                case -1422950858: goto L_0x007c;
                case 104431: goto L_0x0072;
                case 3327612: goto L_0x0068;
                case 3556653: goto L_0x005e;
                case 100313435: goto L_0x0054;
                case 100358090: goto L_0x004a;
                case 109526418: goto L_0x0040;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0086
        L_0x0040:
            java.lang.String r9 = "slice"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x0086
            r5 = 2
            goto L_0x0087
        L_0x004a:
            java.lang.String r9 = "input"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x0086
            r5 = 1
            goto L_0x0087
        L_0x0054:
            java.lang.String r9 = "image"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x0086
            r5 = 0
            goto L_0x0087
        L_0x005e:
            java.lang.String r9 = "text"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x0086
            r5 = 4
            goto L_0x0087
        L_0x0068:
            java.lang.String r9 = "long"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x0086
            r5 = 6
            goto L_0x0087
        L_0x0072:
            java.lang.String r9 = "int"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x0086
            r5 = 5
            goto L_0x0087
        L_0x007c:
            java.lang.String r9 = "action"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x0086
            r5 = 3
            goto L_0x0087
        L_0x0086:
            r5 = -1
        L_0x0087:
            java.lang.String r9 = "obj"
            switch(r5) {
                case 0: goto L_0x00d8;
                case 1: goto L_0x00d1;
                case 2: goto L_0x00c6;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00a6;
                case 5: goto L_0x009a;
                case 6: goto L_0x008e;
                default: goto L_0x008c;
            }
        L_0x008c:
            goto L_0x0140
        L_0x008e:
            java.lang.Long r8 = (java.lang.Long) r8
            long r7 = r8.longValue()
            r6.putLong(r9, r7)
            goto L_0x0140
        L_0x009a:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r5 = r8.intValue()
            r6.putInt(r9, r5)
            goto L_0x0140
        L_0x00a6:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r6.putCharSequence(r9, r8)
            goto L_0x0140
        L_0x00ae:
            oq r8 = (defpackage.oq) r8
            java.lang.Object r5 = r8.a
            android.app.PendingIntent r5 = (android.app.PendingIntent) r5
            r6.putParcelable(r9, r5)
            java.lang.Object r5 = r8.b
            androidx.slice.Slice r5 = (androidx.slice.Slice) r5
            android.os.Bundle r5 = r5.a()
            java.lang.String r7 = "obj_2"
            r6.putBundle(r7, r5)
            goto L_0x0140
        L_0x00c6:
            androidx.slice.Slice r8 = (androidx.slice.Slice) r8
            android.os.Bundle r5 = r8.a()
            r6.putParcelable(r9, r5)
            goto L_0x0140
        L_0x00d1:
            android.os.Parcelable r8 = (android.os.Parcelable) r8
            r6.putParcelable(r9, r8)
            goto L_0x0140
        L_0x00d8:
            android.support.v4.graphics.drawable.IconCompat r8 = (android.support.v4.graphics.drawable.IconCompat) r8
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            int r10 = r8.a
            switch(r10) {
                case -1: goto L_0x0106;
                case 0: goto L_0x00e4;
                case 1: goto L_0x00fe;
                case 2: goto L_0x00f6;
                case 3: goto L_0x00ec;
                case 4: goto L_0x00f6;
                case 5: goto L_0x00fe;
                case 6: goto L_0x00f6;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid icon"
            r0.<init>(r1)
            throw r0
        L_0x00ec:
            java.lang.Object r10 = r8.b
            byte[] r10 = (byte[]) r10
            byte[] r10 = (byte[]) r10
            r5.putByteArray(r9, r10)
            goto L_0x010d
        L_0x00f6:
            java.lang.Object r10 = r8.b
            java.lang.String r10 = (java.lang.String) r10
            r5.putString(r9, r10)
            goto L_0x010d
        L_0x00fe:
            java.lang.Object r10 = r8.b
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            r5.putParcelable(r9, r10)
            goto L_0x010d
        L_0x0106:
            java.lang.Object r10 = r8.b
            android.os.Parcelable r10 = (android.os.Parcelable) r10
            r5.putParcelable(r9, r10)
        L_0x010d:
            int r10 = r8.a
            r5.putInt(r7, r10)
            int r7 = r8.e
            java.lang.String r10 = "int1"
            r5.putInt(r10, r7)
            int r7 = r8.f
            java.lang.String r10 = "int2"
            r5.putInt(r10, r7)
            android.content.res.ColorStateList r7 = r8.g
            if (r7 != 0) goto L_0x0125
            goto L_0x012b
        L_0x0125:
            java.lang.String r10 = "tint_list"
            r5.putParcelable(r10, r7)
        L_0x012b:
            android.graphics.PorterDuff$Mode r7 = r8.i
            android.graphics.PorterDuff$Mode r10 = android.support.v4.graphics.drawable.IconCompat.h
            if (r7 == r10) goto L_0x013c
            android.graphics.PorterDuff$Mode r7 = r8.i
            java.lang.String r7 = r7.name()
            java.lang.String r8 = "tint_mode"
            r5.putString(r8, r7)
        L_0x013c:
            r6.putBundle(r9, r5)
        L_0x0140:
            r1[r4] = r6
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0146:
            java.lang.String r2 = "items"
            r0.putParcelableArray(r2, r1)
            java.lang.String r1 = r11.f
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r2 = "uri"
            r0.putParcelable(r2, r1)
            androidx.slice.SliceSpec r1 = r11.c
            if (r1 == 0) goto L_0x0169
            java.lang.String r1 = r1.a
            r0.putString(r7, r1)
            androidx.slice.SliceSpec r1 = r11.c
            int r1 = r1.b
            java.lang.String r2 = "revision"
            r0.putInt(r2, r1)
        L_0x0169:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.Slice.a():android.os.Bundle");
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Slice ");
        String[] strArr = this.e;
        if (strArr.length > 0) {
            a(sb, strArr);
            sb.append(' ');
        }
        sb.append('[');
        sb.append(this.f);
        sb.append("] {\n");
        String str2 = str + "  ";
        int i = 0;
        while (true) {
            SliceItem[] sliceItemArr = this.d;
            if (i < sliceItemArr.length) {
                sb.append(sliceItemArr[i].b(str2));
                i++;
            } else {
                sb.append(str);
                sb.append('}');
                return sb.toString();
            }
        }
    }
}
