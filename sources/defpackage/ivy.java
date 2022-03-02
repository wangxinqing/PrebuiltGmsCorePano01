package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ivy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ivy {
    public static SafeParcelable a(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra != null) {
            return a(byteArrayExtra, creator);
        }
        return null;
    }

    public static String b(SafeParcelable safeParcelable) {
        return jhy.c(a(safeParcelable));
    }

    public static ArrayList b(Intent intent, String str, Parcelable.Creator creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(a((byte[]) arrayList.get(i), creator));
        }
        return arrayList2;
    }

    public static SafeParcelable a(String str, Parcelable.Creator creator) {
        return a(jhy.b(str), creator);
    }

    public static SafeParcelable a(byte[] bArr, Parcelable.Creator creator) {
        iva.a((Object) creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }

    public static void a(SafeParcelable safeParcelable, Intent intent, String str) {
        intent.putExtra(str, a(safeParcelable));
    }

    public static void a(Iterable iterable, Intent intent, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(a((SafeParcelable) it.next()));
        }
        intent.putExtra(str, arrayList);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.Iterable r4, android.os.Bundle r5, java.lang.String r6) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.size()
            r2 = 0
        L_0x000a:
            if (r2 >= r1) goto L_0x001c
            java.lang.Object r3 = r4.get(r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r3 = (com.google.android.gms.common.internal.safeparcel.SafeParcelable) r3
            byte[] r3 = a(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x000a
        L_0x001c:
            r5.putSerializable(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivy.a(java.lang.Iterable, android.os.Bundle, java.lang.String):void");
    }

    public static byte[] a(SafeParcelable safeParcelable) {
        Parcel obtain = Parcel.obtain();
        safeParcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
