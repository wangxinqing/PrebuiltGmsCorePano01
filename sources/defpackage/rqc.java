package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.lockbox.internal.LockboxOptInFlags;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: rqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rqc {
    public static HashSet b;
    public static final Object c = new Object();
    private static rqc d;
    public final SharedPreferences a;

    public rqc(Context context, String str) {
        this.a = context.getSharedPreferences(str, 4);
    }

    public static rqc a(Context context) {
        rqc rqc;
        synchronized (c) {
            if (d == null) {
                d = new rqc(context.getApplicationContext(), "LockboxOptInSettings");
                b = new HashSet();
            }
            rqc = d;
        }
        return rqc;
    }

    public static String b(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("lockbox-account-event-index-") : "lockbox-account-event-index-".concat(valueOf);
    }

    private final boolean b(String str, int i) {
        boolean z;
        synchronized (this.a) {
            z = this.a.getBoolean("is-migrated", false);
        }
        return this.a.getBoolean(rpb.a(str, i), z);
    }

    public final String a() {
        return this.a.getString("signed-in-account", (String) null);
    }

    public final void a(String str) {
        LockboxOptInFlags lockboxOptInFlags;
        Iterator it;
        synchronized (this.a) {
            lockboxOptInFlags = new LockboxOptInFlags(str, a(str, 1), a(str, 2));
        }
        synchronized (c) {
            it = b.iterator();
        }
        while (it.hasNext()) {
            rpu rpu = (rpu) it.next();
            try {
                Parcel aQ = rpu.aQ();
                bhx.a(aQ, (Parcelable) lockboxOptInFlags);
                rpu.c(2, aQ);
            } catch (RemoteException e) {
                it.remove();
            }
        }
    }

    public final void b() {
        boolean z;
        synchronized (this.a) {
            synchronized (this.a) {
                z = this.a.getBoolean("is-account-renaming-migrated", false);
            }
            if (!z) {
                HashSet<String> hashSet = new HashSet<>();
                for (String next : this.a.getAll().keySet()) {
                    if (next.startsWith("account-event-index-")) {
                        hashSet.add(next);
                    }
                }
                SharedPreferences.Editor edit = this.a.edit();
                for (String str : hashSet) {
                    int i = this.a.getInt(str, -1);
                    String substring = str.substring(20);
                    String b2 = b(substring);
                    String valueOf = String.valueOf(substring);
                    edit.putInt(valueOf.length() == 0 ? new String("udc-account-event-index-") : "udc-account-event-index-".concat(valueOf), i);
                    edit.putInt(b2, i);
                    edit.remove(str);
                }
                edit.putBoolean("is-account-renaming-migrated", true);
                edit.apply();
            }
        }
    }

    public final void a(String str, int i, boolean z) {
        synchronized (this.a) {
            if (b(str, i) != z) {
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences.Editor edit = this.a.edit();
                edit.putBoolean(rpb.a(str, i), z);
                String num = Integer.toString(i);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(num).length());
                sb.append("opt-in-timestamp-");
                sb.append(str);
                sb.append("-");
                sb.append(num);
                edit.putLong(sb.toString(), currentTimeMillis);
                edit.apply();
            }
        }
    }

    public final boolean a(String str, int i) {
        boolean b2;
        synchronized (this.a) {
            b2 = b(str, i);
        }
        return b2;
    }
}
