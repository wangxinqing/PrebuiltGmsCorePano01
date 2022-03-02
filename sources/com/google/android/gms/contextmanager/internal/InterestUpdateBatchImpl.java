package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.contextmanager.interest.InterestRecordStub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InterestUpdateBatchImpl extends AbstractSafeParcelable implements jua {
    public static final Parcelable.Creator CREATOR = new jxk();
    public final ArrayList a;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Operation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new jxl();
        public final int a;
        public final InterestRecordStub b;
        public final String c;

        public Operation(int i, InterestRecordStub interestRecordStub, String str) {
            this.a = i;
            this.b = interestRecordStub;
            this.c = str;
        }

        public final InterestRecordStub a() {
            boolean z = true;
            if (this.a != 1) {
                z = false;
            }
            iva.a(z);
            return this.b;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.b(parcel, 2, this.a);
            ivx.a(parcel, 3, this.b, i, false);
            ivx.a(parcel, 4, this.c, false);
            ivx.b(parcel, a2);
        }
    }

    public InterestUpdateBatchImpl() {
        this.a = new ArrayList();
    }

    public final icf a(icc icc) {
        jxj jxj = new jxj(this, icc);
        icc.a((idf) jxj);
        return jxj;
    }

    public InterestUpdateBatchImpl(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final void a(String str, int i, jup jup, juq juq) {
        cav cav = new cav(str, i, (cbb) jup);
        if (juq != null) {
            iva.a((Object) juq);
            cav.e = (cbc) juq;
            cav.d = true;
        }
        ArrayList arrayList = this.a;
        iva.b(cav.d, "At least one of production, retention, or dispatch policy must be set.");
        aucd o = atke.i.o();
        atjv b = jtj.b(cav.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        atke atke = (atke) o.b;
        atke.c = b.bA;
        atke.a |= 2;
        aucd o2 = atkd.e.o();
        String str2 = cav.a;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atkd atkd = (atkd) o2.b;
        str2.getClass();
        atkd.a |= 4;
        atkd.d = str2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atke atke2 = (atke) o.b;
        atkd atkd2 = (atkd) o2.i();
        atkd2.getClass();
        atke2.h = atkd2;
        atke2.a |= 64;
        cbc cbc = cav.e;
        if (cbc != null) {
            atkm atkm = cbc.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atke atke3 = (atke) o.b;
            atkm.getClass();
            atke3.e = atkm;
            atke3.a |= 8;
        }
        atkh atkh = cav.c.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atke atke4 = (atke) o.b;
        atkh.getClass();
        atke4.d = atkh;
        atke4.a |= 4;
        arrayList.add(new Operation(1, new InterestRecordStub((atke) o.i()), (String) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, this.a, false);
        ivx.b(parcel, a2);
    }
}
