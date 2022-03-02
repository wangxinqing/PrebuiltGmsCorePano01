package defpackage;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: ajna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajna {
    public final Account a;
    public final Long b;
    public boolean c;
    public final boolean d;
    public final boolean e = false;
    public boolean f;
    public final boolean g;
    public Boolean h;
    public final Boolean i;
    public final String j;
    public final boolean k;
    public final Long l;
    public final Integer m;
    public Boolean n;
    public final boolean o;
    public final Boolean p;
    public final Integer q;
    public final String r;
    public final boolean s;

    public ajna(ajmz ajmz) {
        Account account = ajmz.a;
        iva.a((Object) account, (Object) "account");
        this.a = account;
        this.b = ajmz.b;
        this.c = ajmz.c;
        this.d = ajmz.d;
        this.f = ajmz.e;
        this.g = ajmz.f;
        this.h = ajmz.g;
        this.i = ajmz.h;
        this.j = ajmz.i;
        this.k = ajmz.j;
        this.l = ajmz.k;
        this.m = ajmz.l;
        this.n = ajmz.m;
        this.p = ajmz.n;
        this.q = ajmz.p;
        this.o = ajmz.o;
        this.r = ajmz.q;
        this.s = ajmz.r;
    }

    public static ajmz a(Account account, String str) {
        return new ajmz(account, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajna) {
            ajna ajna = (ajna) obj;
            if (this.a.equals(ajna.a) && atiu.a(this.b, ajna.b) && this.c == ajna.c && this.d == ajna.d) {
                boolean z = ajna.e;
                return this.f == ajna.f && this.g == ajna.g && atiu.a(this.h, ajna.h) && atiu.a(this.i, ajna.i) && atiu.a(this.j, ajna.j) && atiu.a(Boolean.valueOf(this.k), Boolean.valueOf(ajna.k)) && atiu.a(this.l, ajna.l) && atiu.a(this.m, ajna.m) && atiu.a(this.n, ajna.n) && atiu.a(this.p, ajna.p) && atiu.a(this.q, ajna.q) && atiu.a(Boolean.valueOf(this.o), Boolean.valueOf(ajna.o)) && this.s == ajna.s;
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d), false, Boolean.valueOf(this.f), Boolean.valueOf(this.g), this.h, this.i, this.j, Boolean.valueOf(this.k), this.l, this.m, this.n, this.p, this.q, Boolean.valueOf(this.o), Boolean.valueOf(this.s)});
    }

    public final String toString() {
        String a2 = rmp.a(this.a);
        String valueOf = String.valueOf(this.b);
        boolean z = this.c;
        boolean z2 = this.d;
        boolean z3 = this.f;
        boolean z4 = this.g;
        String valueOf2 = String.valueOf(this.h);
        String valueOf3 = String.valueOf(this.i);
        String str = this.j;
        boolean z5 = this.k;
        String valueOf4 = String.valueOf(this.l);
        String valueOf5 = String.valueOf(this.m);
        String valueOf6 = String.valueOf(this.n);
        String valueOf7 = String.valueOf(this.p);
        String valueOf8 = String.valueOf(this.q);
        boolean z6 = z5;
        String str2 = this.r;
        boolean z7 = z4;
        boolean z8 = this.s;
        int length = String.valueOf(a2).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(str).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(valueOf6).length();
        int length9 = String.valueOf(valueOf7).length();
        boolean z9 = z8;
        StringBuilder sb = new StringBuilder(length + 356 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf8).length() + String.valueOf(str2).length());
        sb.append("ConfigUpdate{mAccount=");
        sb.append(a2);
        sb.append(", mReferenceUpdateNumber=");
        sb.append(valueOf);
        sb.append(", mUnconditional=");
        sb.append(z);
        sb.append(", mUiUpdate=");
        sb.append(z2);
        sb.append(", mUlrRelatedSettingUpdate=false, mLhLrMergeSettingUpdate");
        sb.append(z3);
        sb.append(", mShouldNotSync=");
        sb.append(z7);
        sb.append(", mReportingEnabled=");
        sb.append(valueOf2);
        sb.append(", mHistoryEnabled=");
        sb.append(valueOf3);
        sb.append(", mCausePackage=");
        sb.append(str);
        sb.append(", mClearCausePackage=");
        sb.append(z6);
        sb.append(", mServerMillis=");
        sb.append(valueOf4);
        sb.append(", mRestriction=");
        sb.append(valueOf5);
        sb.append(", mDirty=");
        sb.append(valueOf6);
        sb.append(", mPrimaryDevice=");
        sb.append(valueOf7);
        sb.append(", mAccountType=");
        sb.append(valueOf8);
        sb.append(", mAuditToken=");
        sb.append(str2);
        sb.append(", isAuditable=");
        sb.append(z9);
        sb.append('}');
        return sb.toString();
    }

    public final void a() {
        this.f = true;
        this.n = true;
        this.c = true;
    }

    public final void a(boolean z) {
        this.h = Boolean.valueOf(z);
    }
}
