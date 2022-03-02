package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GlobalSearchApplication extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dsv();
    public final GlobalSearchApplicationInfo a;
    public final GlobalSearchAppCorpusFeatures[] b;
    public final boolean c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GlobalSearchApplication(com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r6, boolean r7, java.util.Map r8) {
        /*
            r5 = this;
            if (r8 == 0) goto L_0x003d
            int r0 = r8.size()
            com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures[] r0 = new com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures[r0]
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
            r1 = 0
        L_0x0011:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r8.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures r3 = new com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            defpackage.iva.a((java.lang.Object) r4)
            java.lang.Object r2 = r2.getValue()
            com.google.android.gms.appdatasearch.Feature[] r2 = (com.google.android.gms.appdatasearch.Feature[]) r2
            java.lang.Object r2 = defpackage.iva.a((java.lang.Object) r2)
            com.google.android.gms.appdatasearch.Feature[] r2 = (com.google.android.gms.appdatasearch.Feature[]) r2
            r3.<init>(r4, r2)
            r0[r1] = r3
            int r1 = r1 + 1
            goto L_0x0011
        L_0x003c:
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            r5.<init>((com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r6, (com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures[]) r0, (boolean) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.appdatasearch.GlobalSearchApplication.<init>(com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo, boolean, java.util.Map):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GlobalSearchApplication) {
            GlobalSearchApplication globalSearchApplication = (GlobalSearchApplication) obj;
            return ius.a(this.a, globalSearchApplication.a) && ius.a(Boolean.valueOf(this.c), Boolean.valueOf(globalSearchApplication.c)) && Arrays.equals(this.b, globalSearchApplication.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        dsv.a(this, parcel, i);
    }

    public GlobalSearchApplication(GlobalSearchApplicationInfo globalSearchApplicationInfo, GlobalSearchAppCorpusFeatures[] globalSearchAppCorpusFeaturesArr, boolean z) {
        this.a = globalSearchApplicationInfo;
        this.b = globalSearchAppCorpusFeaturesArr;
        this.c = z;
    }
}
