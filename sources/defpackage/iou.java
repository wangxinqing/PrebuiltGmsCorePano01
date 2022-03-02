package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.util.Log;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* renamed from: iou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iou extends yiu implements Closeable {
    public static final /* synthetic */ int b = 0;
    public final Context a;
    private final ior g;
    private final yfg h;

    public iou(Context context, ior ior, yfg yfg, yiz yiz) {
        super(context, yfg, (yfw) null, yiz, new iot(context), 3, ios.a);
        this.a = context;
        this.g = ior;
        this.h = yfg;
    }

    /* access modifiers changed from: protected */
    public final String a(String str) {
        String str2;
        if (str != null) {
            anaf d = d();
            if (d.containsKey(str)) {
                ior ior = this.g;
                Account account = (Account) d.get(str);
                String peekAuthToken = ior.a.peekAuthToken(account, ayzv.b());
                if (peekAuthToken == null || peekAuthToken.isEmpty()) {
                    Log.i("AuthTokenRetriever", "auth token null");
                    return null;
                }
                String b2 = ayzv.b();
                String a2 = ior.a("com.google.android.gms");
                if (a2 == null || a2.isEmpty()) {
                    str2 = null;
                } else {
                    str2 = amre.a(':').a((Iterable) amzy.a("EXP", "com.google.android.gms", a2, b2));
                }
                if (str2 != null && !str2.isEmpty()) {
                    String userData = ior.a.getUserData(account, str2);
                    if (userData == null || userData.isEmpty()) {
                        Log.i("AuthTokenRetriever", "Auth token my be expired.");
                    } else {
                        try {
                            if (Long.valueOf(userData).longValue() < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                                Log.i("AuthTokenRetriever", "EXPIRED");
                                return null;
                            }
                        } catch (NumberFormatException e) {
                            Log.i("AuthTokenRetriever", "Not a long", e);
                        }
                    }
                    return peekAuthToken;
                }
                Log.i("AuthTokenRetriever", "tokenCacheKey null");
                return null;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final avrb c() {
        return yii.a(this.a);
    }

    public final void close() {
        yfg yfg = this.h;
        if (yfg != null) {
            yfg.close();
        }
    }

    /* access modifiers changed from: package-private */
    public final anaf d() {
        try {
            Account[] accountsByType = AccountManager.get(this.a).getAccountsByType("com.google");
            anab anab = new anab();
            for (Account account : accountsByType) {
                anab.a(account.name, account);
            }
            return anab.a();
        } catch (SecurityException e) {
            Log.e("HeterodyneSyncerSB", "Failed to get device user accounts", e);
            return anfu.b;
        }
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        this.g.a.invalidateAuthToken("com.google", str);
    }

    public final String[] a() {
        anax j = d().keySet();
        return (String[]) j.toArray(new String[j.size()]);
    }
}
