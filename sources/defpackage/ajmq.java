package defpackage;

import android.accounts.Account;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: ajmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajmq {
    private static final List x = new ArrayList();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    @Deprecated
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    @Deprecated
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    private final Account y;

    public ajmq(Account account) {
        this.y = account;
        String valueOf = String.valueOf(account);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append("deviceTag_");
        sb.append(valueOf);
        this.a = sb.toString();
        String valueOf2 = String.valueOf(account);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("inactivationMillis_");
        sb2.append(valueOf2);
        this.b = sb2.toString();
        String valueOf3 = String.valueOf(account);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
        sb3.append("gcmIdUploadTime_");
        sb3.append(valueOf3);
        this.c = sb3.toString();
        String valueOf4 = String.valueOf(account);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 15);
        sb4.append("lastUploadTime_");
        sb4.append(valueOf4);
        this.d = sb4.toString();
        String valueOf5 = String.valueOf(account);
        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 11);
        sb5.append("authorized_");
        sb5.append(valueOf5);
        this.e = sb5.toString();
        String valueOf6 = String.valueOf(account);
        StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 26);
        sb6.append("authenticationFailureTime_");
        sb6.append(valueOf6);
        this.f = sb6.toString();
        String valueOf7 = String.valueOf(account);
        StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf7).length() + 22);
        sb7.append("account_reboot_number_");
        sb7.append(valueOf7);
        this.g = sb7.toString();
        String valueOf8 = String.valueOf(account);
        StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf8).length() + 10);
        sb8.append("ambiguous_");
        sb8.append(valueOf8);
        this.h = sb8.toString();
        String valueOf9 = String.valueOf(account);
        StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf9).length() + 6);
        sb9.append("dirty_");
        sb9.append(valueOf9);
        this.i = sb9.toString();
        String valueOf10 = String.valueOf(account);
        StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf10).length() + 13);
        sb10.append("serverMillis_");
        sb10.append(valueOf10);
        this.j = sb10.toString();
        String valueOf11 = String.valueOf(account);
        StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf11).length() + 13);
        sb11.append("updateNumber_");
        sb11.append(valueOf11);
        this.k = sb11.toString();
        String valueOf12 = String.valueOf(account);
        StringBuilder sb12 = new StringBuilder(String.valueOf(valueOf12).length() + 13);
        sb12.append("clientMillis_");
        sb12.append(valueOf12);
        this.l = sb12.toString();
        String valueOf13 = String.valueOf(account);
        StringBuilder sb13 = new StringBuilder(String.valueOf(valueOf13).length() + 12);
        sb13.append("restriction_");
        sb13.append(valueOf13);
        this.m = sb13.toString();
        String valueOf14 = String.valueOf(account);
        StringBuilder sb14 = new StringBuilder(String.valueOf(valueOf14).length() + 17);
        sb14.append("reportingEnabled_");
        sb14.append(valueOf14);
        this.n = sb14.toString();
        String valueOf15 = String.valueOf(account);
        StringBuilder sb15 = new StringBuilder(String.valueOf(valueOf15).length() + 17);
        sb15.append("reportingPackage_");
        sb15.append(valueOf15);
        this.o = sb15.toString();
        String valueOf16 = String.valueOf(account);
        StringBuilder sb16 = new StringBuilder(String.valueOf(valueOf16).length() + 15);
        sb16.append("historyEnabled_");
        sb16.append(valueOf16);
        this.p = sb16.toString();
        String valueOf17 = String.valueOf(account);
        StringBuilder sb17 = new StringBuilder(String.valueOf(valueOf17).length() + 15);
        sb17.append("historyPackage_");
        sb17.append(valueOf17);
        this.q = sb17.toString();
        String valueOf18 = String.valueOf(account);
        StringBuilder sb18 = new StringBuilder(String.valueOf(valueOf18).length() + 14);
        sb18.append("primaryDevice_");
        sb18.append(valueOf18);
        this.r = sb18.toString();
        String valueOf19 = String.valueOf(account);
        StringBuilder sb19 = new StringBuilder(String.valueOf(valueOf19).length() + 12);
        sb19.append("accountType_");
        sb19.append(valueOf19);
        this.s = sb19.toString();
        String valueOf20 = String.valueOf(account);
        StringBuilder sb20 = new StringBuilder(String.valueOf(valueOf20).length() + 15);
        sb20.append("overriddenByUi_");
        sb20.append(valueOf20);
        this.t = sb20.toString();
        String valueOf21 = String.valueOf(account);
        StringBuilder sb21 = new StringBuilder(String.valueOf(valueOf21).length() + 21);
        sb21.append("auto_enable_eligible_");
        sb21.append(valueOf21);
        this.u = sb21.toString();
        String valueOf22 = String.valueOf(account);
        StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 24);
        sb22.append("auto_enable_new_account_");
        sb22.append(valueOf22);
        this.v = sb22.toString();
        String valueOf23 = String.valueOf(account);
        StringBuilder sb23 = new StringBuilder(String.valueOf(valueOf23).length() + 28);
        sb23.append("auto_enable_history_enabled_");
        sb23.append(valueOf23);
        this.w = sb23.toString();
    }

    public static synchronized ajmq a(Account account) {
        ajmq ajmq;
        synchronized (ajmq.class) {
            iva.a((Object) account, (Object) "null account");
            int i2 = 0;
            while (true) {
                if (i2 >= x.size()) {
                    ajmq = null;
                    break;
                }
                ajmq = (ajmq) x.get(i2);
                if (account.equals(ajmq.y)) {
                    break;
                }
                i2++;
            }
            if (ajmq != null) {
                return ajmq;
            }
            ajmq ajmq2 = new ajmq(account);
            x.add(ajmq2);
            return ajmq2;
        }
    }

    public static synchronized void b(Account account) {
        synchronized (ajmq.class) {
            Iterator it = x.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (account.equals(((ajmq) it.next()).y)) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public static Set a(SharedPreferences sharedPreferences, Account... accountArr) {
        HashSet hashSet = new HashSet();
        for (String next : sharedPreferences.getAll().keySet()) {
            if (next.endsWith("}") && next.contains("Account {name=")) {
                int length = accountArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (next.endsWith(accountArr[i2].toString())) {
                            break;
                        }
                        i2++;
                    } else {
                        hashSet.add(next);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }

    public static boolean a(String str) {
        return str != null && str.startsWith("deviceTag_");
    }
}
