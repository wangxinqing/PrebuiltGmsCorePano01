package defpackage;

import android.text.TextUtils;

/* renamed from: apvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apvm implements aptv {
    public boolean a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public String i;

    public final /* bridge */ /* synthetic */ audx a() {
        aucd o = alnd.j.o();
        if (this.a) {
            String str = this.b;
            if (o.c) {
                o.c();
                o.c = false;
            }
            alnd alnd = (alnd) o.b;
            str.getClass();
            int i2 = alnd.a | 2;
            alnd.a = i2;
            alnd.c = str;
            String str2 = this.c;
            str2.getClass();
            alnd.a = i2 | 16;
            alnd.f = str2;
        } else if (TextUtils.isEmpty(this.f)) {
            String str3 = this.d;
            if (o.c) {
                o.c();
                o.c = false;
            }
            alnd alnd2 = (alnd) o.b;
            str3.getClass();
            int i3 = alnd2.a | 1;
            alnd2.a = i3;
            alnd2.b = str3;
            String str4 = this.e;
            str4.getClass();
            alnd2.a = i3 | 4;
            alnd2.d = str4;
        } else {
            String str5 = this.f;
            if (o.c) {
                o.c();
                o.c = false;
            }
            alnd alnd3 = (alnd) o.b;
            str5.getClass();
            int i4 = alnd3.a | 8;
            alnd3.a = i4;
            alnd3.e = str5;
            String str6 = this.b;
            str6.getClass();
            alnd3.a = i4 | 2;
            alnd3.c = str6;
        }
        String str7 = this.g;
        if (str7 != null) {
            alnd alnd4 = (alnd) o.b;
            str7.getClass();
            alnd4.a |= 32;
            alnd4.g = str7;
        }
        if (!this.h) {
            alnd alnd5 = (alnd) o.b;
            alnd5.h = 2;
            alnd5.a |= 64;
        }
        String str8 = this.i;
        if (str8 != null) {
            alnd alnd6 = (alnd) o.b;
            str8.getClass();
            alnd6.a |= 128;
            alnd6.i = str8;
        }
        return (alnd) o.i();
    }
}
