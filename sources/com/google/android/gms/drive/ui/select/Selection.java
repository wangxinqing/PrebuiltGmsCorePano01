package com.google.android.gms.drive.ui.select;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FilterHolder;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Selection implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new lps();
    public static final ith a = new ith("Selection", "");
    public Filter b;
    public DriveId c;
    public jzr d;
    private final icm e = new lpt(this);
    private final Set f;

    public final void a() {
        for (lpu c2 : this.f) {
            c2.c();
        }
    }

    public final void b(jzr jzr) {
        if ((this.d == null || !jzr.a().equals(this.c)) && a(jzr)) {
            this.c = jzr.a();
            this.d = (jzr) jzr.r();
            a();
        }
    }

    public final boolean b() {
        return this.d != null || this.c == null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new FilterHolder(this.b), i);
        parcel.writeParcelable(this.c, i);
    }

    public Selection(Filter filter, DriveId driveId) {
        this.b = filter;
        this.f = new HashSet();
        this.c = driveId;
        this.d = null;
    }

    public final void a(icc icc, DriveId driveId) {
        driveId.c().a(icc).a(this.e);
    }

    public final void a(lpu lpu) {
        this.f.add(lpu);
        if (b()) {
            lpu.c();
        }
    }

    public final void b(lpu lpu) {
        this.f.remove(lpu);
    }

    public final boolean a(jzr jzr) {
        return ((Boolean) this.b.a(new lik(jzr))).booleanValue();
    }
}
