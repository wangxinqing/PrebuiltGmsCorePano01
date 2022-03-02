package com.google.android.location.reporting.state.update;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.location.reporting.state.utils.InactiveReason;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AccountConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajmt();
    public final Account a;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final String h;
    public final long i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final Conditions m;
    public final int n;
    public final String o;
    public final Long p;
    public final Long q;
    public final boolean r;
    public final int s;

    public AccountConfig(ajms ajms) {
        Account account = ajms.a;
        iva.a((Object) account);
        this.a = account;
        this.b = ajms.c.booleanValue();
        this.c = ajms.b.longValue();
        this.d = ajms.d.booleanValue();
        this.e = ajms.i.booleanValue();
        this.f = ajms.j;
        this.g = ajms.k.booleanValue();
        this.h = ajms.l;
        this.i = ajms.g.longValue();
        this.j = ajms.h.intValue();
        this.k = ajms.f.booleanValue();
        this.l = ajms.e.booleanValue();
        Conditions conditions = ajms.m;
        iva.a((Object) conditions);
        this.m = conditions;
        this.n = ajms.n.intValue();
        this.p = ajms.p;
        this.o = ajms.o;
        this.q = ajms.q;
        this.r = ajms.r.booleanValue();
        this.s = ajms.s.intValue();
    }

    private final int a(boolean z) {
        if (this.b) {
            return !z ? -1 : 1;
        }
        return 0;
    }

    public final int b() {
        return a(this.g);
    }

    public final boolean c() {
        return this.j != 0;
    }

    public final List d() {
        return this.m.b();
    }

    public final List e() {
        InactiveReason inactiveReason;
        List d2 = d();
        if (!d2.isEmpty()) {
            return d2;
        }
        if (!this.m.d) {
            d2.add(new InactiveReason(4, "GoogleLocationDisabled"));
        }
        if (!this.d) {
            d2.add(new InactiveReason(5, "NotGoogleAccountOnDevice"));
        }
        if (!this.k) {
            d2.add(new InactiveReason(10, "AuthError"));
        }
        if (!this.e) {
            d2.add(new InactiveReason(6, "ReportingNotEnabled"));
        }
        if (!this.g) {
            d2.add(new InactiveReason(14, "HistoryNotEnabled"));
        }
        switch (this.j) {
            case 0:
                inactiveReason = null;
                break;
            case 1:
                inactiveReason = new InactiveReason(7, "AgeUnder13");
                break;
            case 2:
                inactiveReason = new InactiveReason(7, "AgeUnknown");
                break;
            case 3:
                inactiveReason = new InactiveReason(7, "DasherPolicy");
                break;
            case 4:
                inactiveReason = new InactiveReason(7, "LegalCountry");
                break;
            case 5:
                inactiveReason = new InactiveReason(7, "AccountDeleted");
                break;
            case 6:
                inactiveReason = new InactiveReason(7, "AccountPurged");
                break;
            default:
                inactiveReason = new InactiveReason(7, "UnknownRestriction");
                break;
        }
        if (inactiveReason != null) {
            d2.add(inactiveReason);
        }
        return Collections.unmodifiableList(d2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccountConfig) {
            AccountConfig accountConfig = (AccountConfig) obj;
            return this.a.equals(accountConfig.a) && this.b == accountConfig.b && this.c == accountConfig.c && this.d == accountConfig.d && this.e == accountConfig.e && atiu.a(this.f, accountConfig.f) && this.g == accountConfig.g && atiu.a(this.h, accountConfig.h) && this.i == accountConfig.i && this.j == accountConfig.j && this.k == accountConfig.k && this.l == accountConfig.l && this.m.equals(accountConfig.m) && this.n == accountConfig.n && this.r == accountConfig.r && this.s == accountConfig.s && atiu.a(this.p, accountConfig.p) && atiu.a(this.q, accountConfig.q) && atiu.a(this.o, accountConfig.o);
        }
    }

    public final boolean f() {
        return this.m.c();
    }

    public final boolean g() {
        return f() && this.d && !c();
    }

    public final boolean h() {
        boolean z = false;
        if (i() && this.m.d) {
            z = true;
        }
        if (!z || this.m.e) {
            return z;
        }
        ajjb.a("OptInWithLocationOff");
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Long.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g), this.h, Long.valueOf(this.i), Integer.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), this.m, Integer.valueOf(this.n), this.o, this.p, this.q, Boolean.valueOf(this.r), Integer.valueOf(this.s)});
    }

    public final boolean i() {
        return g() && this.k;
    }

    public final boolean j() {
        if (aztb.a.a().am()) {
            return e().isEmpty() && this.m.e;
        }
        return e().isEmpty();
    }

    public final String toString() {
        String str;
        String str2 = this.o;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder(str2.length() + 2);
            sb.append('\"');
            sb.append(str2);
            sb.append('\"');
            str = sb.toString();
        } else {
            str = "null";
        }
        atit a2 = atiu.a(this);
        a2.a("mAccount", rmp.a(this.a));
        a2.a("isActive", Boolean.valueOf(j()));
        a2.a("mDefined", Boolean.valueOf(this.b));
        a2.a("mUpdateNumber", Long.valueOf(this.c));
        a2.a("mValidAccount", Boolean.valueOf(this.d));
        a2.a("mReportingEnabled", Boolean.valueOf(this.e));
        a2.a("mReportingPackage", this.f);
        a2.a("mHistoryEnabled", Boolean.valueOf(this.g));
        a2.a("mHistoryPackage", this.h);
        a2.a("mServerMillis", Long.valueOf(this.i));
        a2.a("mRestriction", Integer.valueOf(this.j));
        a2.a("mAuthorized", Boolean.valueOf(this.k));
        a2.a("mDirty", Boolean.valueOf(this.l));
        a2.a("mConditions", this.m);
        a2.a("mDeviceTag", rmp.a(Integer.valueOf(this.n)));
        a2.a("mDevicePrettyName", str);
        a2.a("mGcmIdUploadTime", this.p);
        a2.a("mLastUploadTimeMs", this.q);
        a2.a("mPrimaryDevice", Boolean.valueOf(this.r));
        a2.a("mAccountType", Integer.valueOf(this.s));
        return a2.toString();
    }

    public static ajms a(Account account) {
        return new ajms(account);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i2, false);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f, false);
        ivx.a(parcel, 8, this.g);
        ivx.a(parcel, 9, this.h, false);
        ivx.a(parcel, 10, this.i);
        ivx.b(parcel, 11, this.j);
        ivx.a(parcel, 12, this.k);
        ivx.a(parcel, 13, this.l);
        ivx.a(parcel, 14, this.m, i2, false);
        ivx.b(parcel, 15, this.n);
        ivx.a(parcel, 16, this.o, false);
        ivx.a(parcel, 17, this.p);
        ivx.a(parcel, 18, this.q);
        ivx.a(parcel, 19, this.r);
        ivx.b(parcel, 20, this.s);
        ivx.b(parcel, a2);
    }

    public final int a() {
        return a(this.e);
    }

    public AccountConfig(Account account, boolean z, long j2, boolean z2, boolean z3, String str, boolean z4, String str2, long j3, int i2, boolean z5, boolean z6, Conditions conditions, int i3, String str3, Long l2, Long l3, boolean z7, int i4) {
        this.a = account;
        this.b = z;
        this.c = j2;
        this.d = z2;
        this.e = z3;
        this.f = str;
        this.g = z4;
        this.h = str2;
        this.i = j3;
        this.j = i2;
        this.k = z5;
        this.l = z6;
        this.m = conditions;
        this.n = i3;
        this.p = l2;
        this.o = str3;
        this.q = l3;
        this.r = z7;
        this.s = i4;
    }

    public final ReportingState a(int i2, int i3, boolean z, boolean z2) {
        return new ReportingState(a(), b(), g(), j(), i2, i3, z ? Integer.valueOf(this.n) : null, z2);
    }
}
