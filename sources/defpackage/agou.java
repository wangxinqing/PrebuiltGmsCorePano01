package defpackage;

import android.accounts.Account;
import java.io.File;

/* renamed from: agou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agou extends agpj {
    public final File a;
    public final agny b;
    public final Account c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public agou(File file, agny agny, Account account, int i, int i2, int i3, int i4, int i5) {
        this.a = file;
        this.b = agny;
        this.c = account;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
    }

    public final File a() {
        return this.a;
    }

    public final agny b() {
        return this.b;
    }

    public final Account c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agpj) {
            agpj agpj = (agpj) obj;
            return this.a.equals(agpj.a()) && this.b.equals(agpj.b()) && this.c.equals(agpj.c()) && this.d == agpj.d() && this.e == agpj.e() && this.f == agpj.f() && this.g == agpj.g() && this.h == agpj.h();
        }
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        int i5 = this.h;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 188 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Options{storageDirectory=");
        sb.append(valueOf);
        sb.append(", applicationId=");
        sb.append(valueOf2);
        sb.append(", account=");
        sb.append(valueOf3);
        sb.append(", corpus=");
        sb.append(i);
        sb.append(", datatype=");
        sb.append(i2);
        sb.append(", deviceTtlSec=");
        sb.append(i3);
        sb.append(", pushPayloadMaxCount=");
        sb.append(i4);
        sb.append(", pushPayloadMaxAgeDays=");
        sb.append(i5);
        sb.append("}");
        return sb.toString();
    }
}
