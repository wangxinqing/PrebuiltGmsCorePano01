package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.Conditions;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.util.ArrayList;

/* renamed from: ajmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajmp {
    public final SharedPreferences a;

    private ajmp(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static String b(Account account) {
        return ajmq.a(account).b;
    }

    public static String c(Account account) {
        return ajmq.a(account).a;
    }

    public static String d(Account account) {
        return ajmq.a(account).g;
    }

    public static String e(Account account) {
        return ajmq.a(account).c;
    }

    public static String f(Account account) {
        return ajmq.a(account).d;
    }

    public static String g(Account account) {
        return ajmq.a(account).e;
    }

    public static String h(Account account) {
        return ajmq.a(account).f;
    }

    public static ajmp a(Context context) {
        jhg.c();
        return new ajmp(context.getSharedPreferences("ULR_PERSISTENT_PREFS", 0));
    }

    public final boolean b() {
        return this.a.getBoolean("privateModeKey", false);
    }

    public final ReportingConfig a() {
        byte[] bArr;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        Long l;
        boolean z;
        Long l2;
        String str6 = null;
        String string = this.a.getString("reportingConfig", (String) null);
        if (string == null) {
            return null;
        }
        if (string.isEmpty()) {
            return null;
        }
        try {
            bArr = Base64.decode(string, 2);
        } catch (IllegalArgumentException e) {
            ajix.b("GCoreUlr", (Throwable) e);
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        try {
            ajkb ajkb = (ajkb) aucj.a((aucj) ajkb.d, bArr, aubs.c());
            ArrayList arrayList = new ArrayList();
            if ((2 & ajkb.a) != 0) {
                aucx aucx = ajkb.b;
                int size = aucx.size();
                int i2 = 0;
                while (i2 < size) {
                    ajjm ajjm = (ajjm) aucx.get(i2);
                    int i3 = ajjm.a;
                    if ((i3 & 1) != 0) {
                        str = ajjm.b;
                    } else {
                        str = str6;
                    }
                    if ((i3 & 2) != 0) {
                        str2 = ajjm.c;
                    } else {
                        str2 = str6;
                    }
                    Account account = new Account(str, str2);
                    ajjq ajjq = ajjm.n;
                    if (ajjq == null) {
                        ajjq = ajjq.i;
                    }
                    Conditions a2 = Conditions.a(ajjq);
                    boolean z2 = ajjm.d;
                    long j = ajjm.e;
                    boolean z3 = ajjm.f;
                    boolean z4 = ajjm.h;
                    int i4 = ajjm.a;
                    if ((i4 & 262144) != 0) {
                        str3 = ajjm.s;
                    } else {
                        str3 = null;
                    }
                    aucx aucx2 = aucx;
                    boolean z5 = ajjm.i;
                    if ((i4 & 524288) != 0) {
                        str4 = ajjm.t;
                    } else {
                        str4 = null;
                    }
                    int i5 = size;
                    long j2 = ajjm.j;
                    ajkb ajkb2 = ajkb;
                    int i6 = ajjm.k;
                    int i7 = i2;
                    boolean z6 = ajjm.l;
                    ArrayList arrayList2 = arrayList;
                    boolean z7 = ajjm.m;
                    int i8 = ajjm.o;
                    if ((i4 & 32768) != 0) {
                        i = i8;
                        str5 = ajjm.q;
                    } else {
                        i = i8;
                        str5 = null;
                    }
                    if ((65536 & i4) != 0) {
                        z = z6;
                        l = Long.valueOf(ajjm.r);
                    } else {
                        z = z6;
                        l = null;
                    }
                    if ((ajjm.a & 1048576) != 0) {
                        l2 = Long.valueOf(ajjm.u);
                    } else {
                        l2 = null;
                    }
                    AccountConfig accountConfig = r8;
                    AccountConfig accountConfig2 = new AccountConfig(account, z2, j, z3, z4, str3, z5, str4, j2, i6, z, z7, a2, i, str5, l, l2, ajjm.v, ajkh.a(ajjm.w));
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(accountConfig);
                    i2 = i7 + 1;
                    arrayList = arrayList3;
                    aucx = aucx2;
                    size = i5;
                    ajkb = ajkb2;
                    str6 = null;
                }
                ajkb ajkb3 = ajkb;
                ArrayList arrayList4 = arrayList;
                ajjq ajjq2 = ajkb3.c;
                if (ajjq2 == null) {
                    ajjq2 = ajjq.i;
                }
                return new ReportingConfig(arrayList4, Conditions.a(ajjq2));
            }
            ajix.c("GCoreUlr", 23, "Received invalid proto");
            return null;
        } catch (auda e2) {
            ajix.b("GCoreUlr", (Throwable) e2);
            return null;
        }
    }

    public final Integer a(Account account) {
        String c = c(account);
        if (this.a.contains(c)) {
            return Integer.valueOf(this.a.getInt(c, 0));
        }
        if (!this.a.contains("deviceTag")) {
            return null;
        }
        int i = this.a.getInt("deviceTag", 0);
        SharedPreferences.Editor edit = this.a.edit();
        edit.remove("deviceTag");
        edit.putInt(c, i);
        edit.apply();
        return Integer.valueOf(i);
    }

    public final boolean a(int i, String str) {
        int i2 = this.a.getInt(str, -1);
        if (i2 != -1 && i == i2) {
            return false;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putInt(str, i);
        edit.apply();
        return true;
    }
}
