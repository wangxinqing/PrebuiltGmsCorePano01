package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Thing extends AbstractSafeParcelable implements ReflectedParcelable, aplu {
    public static final Parcelable.Creator CREATOR = new apnc();
    public final int a;
    public final Bundle b;
    public final Metadata c;
    public final String d;
    public final String e;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Metadata extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new apmv();
        public final boolean a;
        public final int b;
        public final String c;
        public final Bundle d;

        public Metadata(boolean z, int i, String str, Bundle bundle) {
            this.a = z;
            this.b = i;
            this.c = str;
            this.d = bundle == null ? new Bundle() : bundle;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0039, code lost:
            r0 = r5.d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a() {
            /*
                r5 = this;
                aplt r0 = new aplt
                r0.<init>()
                com.google.firebase.appindexing.internal.Thing$Metadata r0 = r0.a()
                boolean r1 = r5.a
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                boolean r2 = r0.a
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                boolean r1 = defpackage.ius.a(r1, r2)
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0046
                int r1 = r5.b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r4 = r0.b
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                boolean r1 = defpackage.ius.a(r1, r4)
                if (r1 == 0) goto L_0x0046
                java.lang.String r1 = r5.c
                java.lang.String r0 = r0.c
                boolean r0 = defpackage.ius.a(r1, r0)
                if (r0 == 0) goto L_0x0046
                android.os.Bundle r0 = r5.d
                if (r0 == 0) goto L_0x0045
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x0044
                goto L_0x0046
            L_0x0044:
                return r2
            L_0x0045:
                goto L_0x0047
            L_0x0046:
                r2 = 0
            L_0x0047:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.appindexing.internal.Thing.Metadata.a():boolean");
        }

        public final long[] b(String str) {
            Bundle bundle = this.d;
            if (bundle == null || !(bundle.get(str) instanceof long[])) {
                return null;
            }
            return this.d.getLongArray(str);
        }

        public final boolean[] c(String str) {
            Bundle bundle = this.d;
            if (bundle == null || !(bundle.get(str) instanceof boolean[])) {
                return null;
            }
            return this.d.getBooleanArray(str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Metadata) {
                Metadata metadata = (Metadata) obj;
                return ius.a(Boolean.valueOf(this.a), Boolean.valueOf(metadata.a)) && ius.a(Integer.valueOf(this.b), Integer.valueOf(metadata.b)) && ius.a(this.c, metadata.c) && Thing.a(this.d, metadata.d);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(Thing.a(this.d))});
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("worksOffline: ");
            sb.append(this.a);
            sb.append(", score: ");
            sb.append(this.b);
            if (!this.c.isEmpty()) {
                sb.append(", accountEmail: ");
                sb.append(this.c);
            }
            Bundle bundle = this.d;
            if (bundle != null && !bundle.isEmpty()) {
                sb.append(", Properties { ");
                Thing.a(this.d, sb);
                sb.append("}");
            }
            return sb.toString();
        }

        public final String[] a(String str) {
            Bundle bundle = this.d;
            if (bundle == null || !(bundle.get(str) instanceof String[])) {
                return null;
            }
            return this.d.getStringArray(str);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.a(parcel, 1, this.a);
            ivx.b(parcel, 2, this.b);
            ivx.a(parcel, 3, this.c, false);
            ivx.a(parcel, 4, this.d, false);
            ivx.b(parcel, a2);
        }
    }

    public Thing(int i, Bundle bundle, Metadata metadata, String str, String str2) {
        this.a = i;
        this.b = bundle;
        this.c = metadata;
        this.d = str;
        this.e = str2;
        bundle.setClassLoader(getClass().getClassLoader());
    }

    public static int a(Bundle bundle) {
        ArrayList arrayList = new ArrayList(bundle.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = bundle.get((String) arrayList.get(i));
            if (obj instanceof boolean[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((boolean[]) obj)));
            } else if (obj instanceof long[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((long[]) obj)));
            } else if (obj instanceof double[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((double[]) obj)));
            } else if (obj instanceof byte[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((byte[]) obj)));
            } else if (obj instanceof Object[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((Object[]) obj)));
            } else {
                arrayList2.add(Integer.valueOf(Arrays.hashCode(new Object[]{obj})));
            }
        }
        return Arrays.hashCode(arrayList2.toArray());
    }

    public final String b() {
        return !this.e.equals("Thing") ? this.e : "Indexable";
    }

    public final long[] c(String str) {
        if (this.b.get(str) instanceof long[]) {
            return this.b.getLongArray(str);
        }
        return null;
    }

    public final double[] d(String str) {
        if (this.b.get(str) instanceof double[]) {
            return this.b.getDoubleArray(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Thing) {
            Thing thing = (Thing) obj;
            return ius.a(Integer.valueOf(this.a), Integer.valueOf(thing.a)) && ius.a(this.d, thing.d) && ius.a(this.e, thing.e) && ius.a(this.c, thing.c) && a(this.b, thing.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.d, this.e, Integer.valueOf(this.c.hashCode()), Integer.valueOf(a(this.b))});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b());
        sb.append(" { { id: ");
        if (this.d == null) {
            sb.append("<null>");
        } else {
            sb.append("'");
            sb.append(this.d);
            sb.append("'");
        }
        sb.append(" } Properties { ");
        a(this.b, sb);
        sb.append("} Metadata { ");
        sb.append(this.c.toString());
        sb.append(" } }");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        apnc.a(this, parcel, i);
    }

    public final String[] b(String str) {
        if (this.b.get(str) instanceof String[]) {
            return this.b.getStringArray(str);
        }
        return null;
    }

    public Thing(Bundle bundle, Metadata metadata, String str, String str2) {
        this.a = 10;
        this.b = bundle;
        this.c = metadata;
        this.d = str;
        this.e = str2;
    }

    public static void a(Bundle bundle, StringBuilder sb) {
        try {
            Set keySet = bundle.keySet();
            String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
            Arrays.sort(strArr, apnb.a);
            for (String str : strArr) {
                sb.append("{ key: '");
                sb.append(str);
                sb.append("' value: ");
                Object obj = bundle.get(str);
                if (obj == null) {
                    sb.append("<null>");
                } else if (!obj.getClass().isArray()) {
                    sb.append(obj.toString());
                } else {
                    sb.append("[ ");
                    for (int i = 0; i < Array.getLength(obj); i++) {
                        sb.append("'");
                        sb.append(Array.get(obj, i));
                        sb.append("' ");
                    }
                    sb.append("]");
                }
                sb.append(" } ");
            }
        } catch (RuntimeException e2) {
            sb.append("<error>");
        }
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !a((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null && (obj2 != null || !bundle2.containsKey(str))) {
                return false;
            }
            if (obj instanceof boolean[]) {
                if (!(obj2 instanceof boolean[]) || !Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof long[]) {
                if (!(obj2 instanceof long[]) || !Arrays.equals((long[]) obj, (long[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof double[]) {
                if (!(obj2 instanceof double[]) || !Arrays.equals((double[]) obj, (double[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof byte[]) {
                if (!(obj2 instanceof byte[]) || !Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                    return false;
                }
            } else if ((obj instanceof Object[]) && (!(obj2 instanceof Object[]) || !Arrays.equals((Object[]) obj, (Object[]) obj2))) {
                return false;
            }
        }
        return true;
    }

    public final String a() {
        String[] b2 = b("name");
        if (b2 == null || b2.length != 1) {
            return null;
        }
        return b2[0];
    }

    public final Thing[] a(String str) {
        Parcelable[] parcelableArray;
        if (!(this.b.get(str) instanceof Parcelable[]) || (parcelableArray = this.b.getParcelableArray(str)) == null) {
            return null;
        }
        return (Thing[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Thing[].class);
    }
}
