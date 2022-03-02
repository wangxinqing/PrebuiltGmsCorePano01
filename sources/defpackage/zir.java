package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplefieldacl;

/* renamed from: zir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zir implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Mergedpeoplefieldacl.Entries.Scope[i];
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v10, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = defpackage.ivw.b(r10)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = 0
            r5 = r1
            r6 = r5
            r4 = 0
        L_0x000e:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x0066
            int r1 = r10.readInt()
            int r7 = defpackage.ivw.a((int) r1)
            r8 = 2
            if (r7 == r8) goto L_0x005a
            r8 = 3
            if (r7 == r8) goto L_0x004e
            r8 = 4
            if (r7 == r8) goto L_0x003d
            r8 = 5
            if (r7 == r8) goto L_0x002c
            defpackage.ivw.b(r10, r1)
            goto L_0x0065
        L_0x002c:
            android.os.Parcelable$Creator r6 = com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplefieldacl.Entries.Scope.Person.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r10, (int) r1, (android.os.Parcelable.Creator) r6)
            r6 = r1
            com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplefieldacl$Entries$Scope$Person r6 = (com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplefieldacl.Entries.Scope.Person) r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x0065
        L_0x003d:
            android.os.Parcelable$Creator r5 = com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplefieldacl.Entries.Scope.Membership.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r10, (int) r1, (android.os.Parcelable.Creator) r5)
            r5 = r1
            com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplefieldacl$Entries$Scope$Membership r5 = (com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplefieldacl.Entries.Scope.Membership) r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x0065
        L_0x004e:
            boolean r4 = defpackage.ivw.c(r10, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x0065
        L_0x005a:
            boolean r3 = defpackage.ivw.c(r10, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
        L_0x0065:
            goto L_0x000e
        L_0x0066:
            int r1 = r10.dataPosition()
            if (r1 != r0) goto L_0x0073
            com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplefieldacl$Entries$Scope r10 = new com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplefieldacl$Entries$Scope
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r10
        L_0x0073:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r10)
            goto L_0x008d
        L_0x008c:
            throw r1
        L_0x008d:
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zir.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
