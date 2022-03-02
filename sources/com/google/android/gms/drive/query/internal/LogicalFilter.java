package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.Filter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LogicalFilter extends AbstractFilter {
    public static final Parcelable.Creator CREATOR = new ljk();
    final Operator a;
    final List b;
    private List c;

    public LogicalFilter(Operator operator, Filter filter, Filter... filterArr) {
        this.a = operator;
        ArrayList arrayList = new ArrayList(2);
        this.b = arrayList;
        arrayList.add(new FilterHolder(filter));
        ArrayList arrayList2 = new ArrayList(2);
        this.c = arrayList2;
        arrayList2.add(filter);
        Filter filter2 = filterArr[0];
        this.b.add(new FilterHolder(filter2));
        this.c.add(filter2);
    }

    public final Object a(ljf ljf) {
        ArrayList arrayList = new ArrayList();
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((FilterHolder) list.get(i)).j.a(ljf));
        }
        return ljf.a(this.a, (List) arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.c(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LogicalFilter(com.google.android.gms.drive.query.internal.Operator r5, java.lang.Iterable r6) {
        /*
            r4 = this;
            r4.<init>()
            r4.a = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.c = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.b = r5
            int r5 = r6.size()
            r0 = 0
        L_0x0018:
            if (r0 >= r5) goto L_0x0032
            java.lang.Object r1 = r6.get(r0)
            com.google.android.gms.drive.query.Filter r1 = (com.google.android.gms.drive.query.Filter) r1
            java.util.List r2 = r4.c
            r2.add(r1)
            java.util.List r2 = r4.b
            com.google.android.gms.drive.query.internal.FilterHolder r3 = new com.google.android.gms.drive.query.internal.FilterHolder
            r3.<init>(r1)
            r2.add(r3)
            int r0 = r0 + 1
            goto L_0x0018
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drive.query.internal.LogicalFilter.<init>(com.google.android.gms.drive.query.internal.Operator, java.lang.Iterable):void");
    }

    public LogicalFilter(Operator operator, List list) {
        this.a = operator;
        this.b = list;
    }
}
