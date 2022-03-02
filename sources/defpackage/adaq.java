package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* renamed from: adaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adaq {
    public static final int[] a = {10, 9};
    private static final Object d = new Object();
    private static adaq e;
    public final SharedPreferences b;
    public final qub c;

    private adaq(Context context, String str) {
        this.b = context.getSharedPreferences(str, 0);
        this.c = qub.a(context);
    }

    private static int a(int i) {
        if (i != 9) {
            return i != 10 ? -1 : 1;
        }
        return 2;
    }

    public static String c(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("opt-in-status-");
        sb.append(str);
        sb.append("-");
        sb.append(a(i));
        return sb.toString();
    }

    public static String d(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
        sb.append("opt-in-timestamp-");
        sb.append(str);
        sb.append("-");
        sb.append(a(i));
        return sb.toString();
    }

    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            z = this.b.getBoolean("is-migrated", false);
        }
        return z;
    }

    public static adaq a(Context context) {
        adaq adaq;
        synchronized (d) {
            if (e == null) {
                e = new adaq(context.getApplicationContext(), "LockboxOptInSettings");
            }
            adaq = e;
        }
        return adaq;
    }

    public final boolean b(String str, int i) {
        boolean z;
        synchronized (this.b) {
            z = this.b.getBoolean(c(str, i), b());
        }
        return z;
    }

    public final void c() {
        boolean z;
        synchronized (this.b) {
            synchronized (this.b) {
                z = this.b.getBoolean("is-account-renaming-migrated", false);
            }
            if (!z) {
                HashSet<String> hashSet = new HashSet<>();
                synchronized (this.b) {
                    for (String next : this.b.getAll().keySet()) {
                        if (next.startsWith("account-event-index-")) {
                            hashSet.add(next);
                        }
                    }
                }
                SharedPreferences.Editor edit = this.b.edit();
                for (String str : hashSet) {
                    int i = this.b.getInt(str, -1);
                    String substring = str.substring(20);
                    String a2 = a(substring);
                    String valueOf = String.valueOf(substring);
                    String str2 = valueOf.length() == 0 ? new String("lockbox-account-event-index-") : "lockbox-account-event-index-".concat(valueOf);
                    edit.putInt(a2, i);
                    edit.putInt(str2, i);
                    edit.remove(str);
                }
                edit.putBoolean("is-account-renaming-migrated", true);
                edit.apply();
            }
        }
    }

    public static String a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("udc-account-event-index-") : "udc-account-event-index-".concat(valueOf);
    }

    public final Set a() {
        String str;
        HashSet hashSet = new HashSet();
        synchronized (this.b) {
            for (String next : this.b.getAll().keySet()) {
                if (next.matches("^opt-in-status-.+-\\d+$")) {
                    str = next.substring(14, next.lastIndexOf(45));
                } else {
                    str = null;
                }
                if (str != null) {
                    hashSet.add(str);
                }
            }
        }
        return hashSet;
    }

    public final boolean a(String str, int i) {
        boolean b2;
        synchronized (this.b) {
            b2 = b(str, i);
        }
        return b2;
    }
}
