package androidx.slice;

import android.app.PendingIntent;
import android.support.v4.graphics.drawable.IconCompat;
import android.text.Spannable;
import android.text.style.AlignmentSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SliceItem extends CustomVersionedParcelable {
    protected String[] a;
    public String b;
    public String c;
    public Object d;
    public CharSequence e;
    SliceItemHolder f;

    public SliceItem() {
        this.a = Slice.a;
        this.b = "text";
        this.c = null;
    }

    public static void a(Spannable spannable) {
        Object obj;
        for (Object obj2 : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (!a(obj2)) {
                obj = null;
            } else {
                obj = obj2;
            }
            if (obj != obj2) {
                if (obj != null) {
                    spannable.setSpan(obj, spannable.getSpanStart(obj2), spannable.getSpanEnd(obj2), spannable.getSpanFlags(obj2));
                }
                spannable.removeSpan(obj2);
            }
        }
    }

    public final CharSequence b() {
        return (CharSequence) this.d;
    }

    public final IconCompat c() {
        return (IconCompat) this.d;
    }

    public final PendingIntent d() {
        Object obj = ((oq) this.d).a;
        if (obj instanceof PendingIntent) {
            return (PendingIntent) obj;
        }
        return null;
    }

    public final int e() {
        return ((Integer) this.d).intValue();
    }

    public final Slice f() {
        if ("action".equals(this.b)) {
            return (Slice) ((oq) this.d).b;
        }
        return (Slice) this.d;
    }

    public final long g() {
        return ((Long) this.d).longValue();
    }

    public final String toString() {
        return b("");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SliceItem(android.os.Bundle r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String[] r0 = androidx.slice.Slice.a
            r4.a = r0
            java.lang.String r0 = "text"
            r4.b = r0
            r1 = 0
            r4.c = r1
            java.lang.String r1 = "hints"
            java.lang.String[] r1 = r5.getStringArray(r1)
            r4.a = r1
            java.lang.String r1 = "format"
            java.lang.String r1 = r5.getString(r1)
            r4.b = r1
            java.lang.String r1 = "subtype"
            java.lang.String r1 = r5.getString(r1)
            r4.c = r1
            java.lang.String r1 = r4.b
            int r2 = r1.hashCode()
            switch(r2) {
                case -1422950858: goto L_0x006a;
                case 104431: goto L_0x0060;
                case 3327612: goto L_0x0056;
                case 3556653: goto L_0x004e;
                case 100313435: goto L_0x0044;
                case 100358090: goto L_0x003a;
                case 109526418: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0074
        L_0x0030:
            java.lang.String r0 = "slice"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0074
            r0 = 2
            goto L_0x0075
        L_0x003a:
            java.lang.String r0 = "input"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0074
            r0 = 1
            goto L_0x0075
        L_0x0044:
            java.lang.String r0 = "image"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0074
            r0 = 0
            goto L_0x0075
        L_0x004e:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0074
            r0 = 3
            goto L_0x0075
        L_0x0056:
            java.lang.String r0 = "long"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0074
            r0 = 6
            goto L_0x0075
        L_0x0060:
            java.lang.String r0 = "int"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0074
            r0 = 5
            goto L_0x0075
        L_0x006a:
            java.lang.String r0 = "action"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0074
            r0 = 4
            goto L_0x0075
        L_0x0074:
            r0 = -1
        L_0x0075:
            java.lang.String r2 = "obj"
            switch(r0) {
                case 0: goto L_0x00d2;
                case 1: goto L_0x00cc;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00a5;
                case 5: goto L_0x009b;
                case 6: goto L_0x0091;
                default: goto L_0x007a;
            }
        L_0x007a:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unsupported type "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0091:
            long r0 = r5.getLong(r2)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            goto L_0x00db
        L_0x009b:
            int r5 = r5.getInt(r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x00db
        L_0x00a5:
            oq r0 = new oq
            android.os.Parcelable r1 = r5.getParcelable(r2)
            androidx.slice.Slice r2 = new androidx.slice.Slice
            java.lang.String r3 = "obj_2"
            android.os.Bundle r5 = r5.getBundle(r3)
            r2.<init>(r5)
            r0.<init>(r1, r2)
            r5 = r0
            goto L_0x00db
        L_0x00bb:
            java.lang.CharSequence r5 = r5.getCharSequence(r2)
            goto L_0x00db
        L_0x00c1:
            androidx.slice.Slice r0 = new androidx.slice.Slice
            android.os.Bundle r5 = r5.getBundle(r2)
            r0.<init>(r5)
            r5 = r0
            goto L_0x00db
        L_0x00cc:
            android.os.Parcelable r5 = r5.getParcelable(r2)
            goto L_0x00db
        L_0x00d2:
            android.os.Bundle r5 = r5.getBundle(r2)
            android.support.v4.graphics.drawable.IconCompat r5 = android.support.v4.graphics.drawable.IconCompat.a((android.os.Bundle) r5)
        L_0x00db:
            r4.d = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.SliceItem.<init>(android.os.Bundle):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00de, code lost:
        if (r4.equals("action") != false) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r3 = r0.b
            r2.append(r3)
            java.lang.String r3 = r0.c
            if (r3 == 0) goto L_0x0024
            r3 = 60
            r2.append(r3)
            java.lang.String r3 = r0.c
            r2.append(r3)
            r3 = 62
            r2.append(r3)
        L_0x0024:
            r3 = 32
            r2.append(r3)
            java.lang.String[] r4 = r0.a
            int r5 = r4.length
            if (r5 <= 0) goto L_0x0035
            androidx.slice.Slice.a(r2, r4)
            r2.append(r3)
        L_0x0035:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r4 = "  "
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r0.b
            int r5 = r4.hashCode()
            java.lang.String r6 = "slice"
            java.lang.String r7 = "image"
            java.lang.String r8 = "text"
            java.lang.String r9 = "long"
            java.lang.String r10 = "int"
            java.lang.String r11 = "action"
            r12 = 3
            r13 = 2
            r14 = 1
            switch(r5) {
                case -1422950858: goto L_0x0087;
                case 104431: goto L_0x007f;
                case 3327612: goto L_0x0077;
                case 3556653: goto L_0x006f;
                case 100313435: goto L_0x0067;
                case 109526418: goto L_0x005f;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x008f
        L_0x005f:
            boolean r5 = r4.equals(r6)
            if (r5 == 0) goto L_0x008f
            r5 = 0
            goto L_0x0090
        L_0x0067:
            boolean r5 = r4.equals(r7)
            if (r5 == 0) goto L_0x008f
            r5 = 3
            goto L_0x0090
        L_0x006f:
            boolean r5 = r4.equals(r8)
            if (r5 == 0) goto L_0x008f
            r5 = 2
            goto L_0x0090
        L_0x0077:
            boolean r5 = r4.equals(r9)
            if (r5 == 0) goto L_0x008f
            r5 = 5
            goto L_0x0090
        L_0x007f:
            boolean r5 = r4.equals(r10)
            if (r5 == 0) goto L_0x008f
            r5 = 4
            goto L_0x0090
        L_0x0087:
            boolean r5 = r4.equals(r11)
            if (r5 == 0) goto L_0x008f
            r5 = 1
            goto L_0x0090
        L_0x008f:
            r5 = -1
        L_0x0090:
            r15 = 10
            if (r5 == 0) goto L_0x020c
            if (r5 == r14) goto L_0x01e2
            if (r5 == r13) goto L_0x01d1
            if (r5 == r12) goto L_0x01c9
            r1 = 4
            if (r5 == r1) goto L_0x0152
            r1 = 5
            if (r5 == r1) goto L_0x0110
            int r3 = r4.hashCode()
            switch(r3) {
                case -1422950858: goto L_0x00da;
                case 104431: goto L_0x00d2;
                case 3327612: goto L_0x00ca;
                case 3556653: goto L_0x00c2;
                case 100313435: goto L_0x00ba;
                case 100358090: goto L_0x00b0;
                case 109526418: goto L_0x00a8;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            goto L_0x00e1
        L_0x00a8:
            boolean r1 = r4.equals(r6)
            if (r1 == 0) goto L_0x00e1
            r12 = 0
            goto L_0x00e2
        L_0x00b0:
            java.lang.String r1 = "input"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x00e1
            r12 = 6
            goto L_0x00e2
        L_0x00ba:
            boolean r1 = r4.equals(r7)
            if (r1 == 0) goto L_0x00e1
            r12 = 2
            goto L_0x00e2
        L_0x00c2:
            boolean r1 = r4.equals(r8)
            if (r1 == 0) goto L_0x00e1
            r12 = 1
            goto L_0x00e2
        L_0x00ca:
            boolean r3 = r4.equals(r9)
            if (r3 == 0) goto L_0x00e1
            r12 = 5
            goto L_0x00e2
        L_0x00d2:
            boolean r1 = r4.equals(r10)
            if (r1 == 0) goto L_0x00e1
            r12 = 4
            goto L_0x00e2
        L_0x00da:
            boolean r1 = r4.equals(r11)
            if (r1 == 0) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r12 = -1
        L_0x00e2:
            switch(r12) {
                case 0: goto L_0x0109;
                case 1: goto L_0x0106;
                case 2: goto L_0x0103;
                case 3: goto L_0x0100;
                case 4: goto L_0x00fd;
                case 5: goto L_0x00fa;
                case 6: goto L_0x00f7;
                default: goto L_0x00e5;
            }
        L_0x00e5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Unrecognized format: "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L_0x010b
        L_0x00f7:
            java.lang.String r1 = "RemoteInput"
            goto L_0x010b
        L_0x00fa:
            java.lang.String r1 = "Long"
            goto L_0x010b
        L_0x00fd:
            java.lang.String r1 = "Int"
            goto L_0x010b
        L_0x0100:
            java.lang.String r1 = "Action"
            goto L_0x010b
        L_0x0103:
            java.lang.String r1 = "Image"
            goto L_0x010b
        L_0x0106:
            java.lang.String r1 = "Text"
            goto L_0x010b
        L_0x0109:
            java.lang.String r1 = "Slice"
        L_0x010b:
            r2.append(r1)
            goto L_0x0228
        L_0x0110:
            java.lang.String r1 = r0.c
            java.lang.String r3 = "millis"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0144
            long r3 = r16.g()
            r5 = -1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x012b
            java.lang.String r1 = "INFINITY"
            r2.append(r1)
            goto L_0x0228
        L_0x012b:
            long r3 = r16.g()
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            long r5 = r1.getTimeInMillis()
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = 262144(0x40000, float:3.67342E-40)
            java.lang.CharSequence r1 = android.text.format.DateUtils.getRelativeTimeSpanString(r3, r5, r7, r9)
            r2.append(r1)
            goto L_0x0228
        L_0x0144:
            long r3 = r16.g()
            r2.append(r3)
            r1 = 76
            r2.append(r1)
            goto L_0x0228
        L_0x0152:
            java.lang.String r1 = r0.c
            java.lang.String r3 = "color"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0197
            int r1 = r16.e()
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = android.graphics.Color.alpha(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            int r4 = android.graphics.Color.red(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r14] = r4
            int r4 = android.graphics.Color.green(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r13] = r4
            int r1 = android.graphics.Color.blue(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r12] = r1
            java.lang.String r1 = "a=0x%02x r=0x%02x g=0x%02x b=0x%02x"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r2.append(r1)
            goto L_0x0228
        L_0x0197:
            java.lang.String r1 = r0.c
            java.lang.String r3 = "layout_direction"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x01c1
            int r1 = r16.e()
            if (r1 == 0) goto L_0x01bb
            if (r1 == r14) goto L_0x01b8
            if (r1 == r13) goto L_0x01b5
            if (r1 == r12) goto L_0x01b2
            java.lang.String r1 = java.lang.Integer.toString(r1)
            goto L_0x01bd
        L_0x01b2:
            java.lang.String r1 = "LOCALE"
            goto L_0x01bd
        L_0x01b5:
            java.lang.String r1 = "INHERIT"
            goto L_0x01bd
        L_0x01b8:
            java.lang.String r1 = "RTL"
            goto L_0x01bd
        L_0x01bb:
            java.lang.String r1 = "LTR"
        L_0x01bd:
            r2.append(r1)
            goto L_0x0228
        L_0x01c1:
            int r1 = r16.e()
            r2.append(r1)
            goto L_0x0228
        L_0x01c9:
            android.support.v4.graphics.drawable.IconCompat r1 = r16.c()
            r2.append(r1)
            goto L_0x0228
        L_0x01d1:
            r1 = 34
            r2.append(r1)
            java.lang.CharSequence r3 = r16.b()
            r2.append(r3)
            r2.append(r1)
            goto L_0x0228
        L_0x01e2:
            java.lang.Object r4 = r0.d
            oq r4 = (defpackage.oq) r4
            java.lang.Object r4 = r4.a
            r5 = 91
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = "] {\n"
            r2.append(r4)
            androidx.slice.Slice r4 = r16.f()
            java.lang.String r3 = r4.a((java.lang.String) r3)
            r2.append(r3)
            r2.append(r15)
            r2.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r2.append(r1)
            goto L_0x0228
        L_0x020c:
            java.lang.String r4 = "{\n"
            r2.append(r4)
            androidx.slice.Slice r4 = r16.f()
            java.lang.String r3 = r4.a((java.lang.String) r3)
            r2.append(r3)
            r2.append(r15)
            r2.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r2.append(r1)
        L_0x0228:
            java.lang.String r1 = "\n"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.SliceItem.b(java.lang.String):java.lang.String");
    }

    public static boolean a(Object obj) {
        return (obj instanceof AlignmentSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof StyleSpan);
    }

    public final List a() {
        return Arrays.asList(this.a);
    }

    public final boolean a(String str) {
        return anq.a(this.a, str);
    }

    public final boolean a(String... strArr) {
        for (String a2 : strArr) {
            if (anq.a(this.a, a2)) {
                return true;
            }
        }
        return false;
    }

    public SliceItem(Object obj, String str, String str2, String[] strArr) {
        this.a = strArr;
        this.b = str;
        this.c = str2;
        this.d = obj;
    }
}
