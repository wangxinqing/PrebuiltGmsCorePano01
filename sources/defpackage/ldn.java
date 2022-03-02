package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ldn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ldn implements lex {
    public static final ldf a = new ldk();
    private static volatile ldn c;
    public final Set b;
    private final ldf[] d;
    private final Map e = new HashMap();
    private final ley f;
    private final lhx g;
    private final lfr h;
    private final long i;
    private final Map j = new HashMap();

    private ldn(Set set, ley ley, lhx lhx, lfr lfr, long j2, ldf[] ldfArr) {
        this.b = set;
        this.f = ley;
        this.g = lhx;
        this.h = lfr;
        this.i = j2;
        this.d = ldfArr;
        this.e.put("IDLE", a);
        ldf[] ldfArr2 = this.d;
        int length = ldfArr2.length;
        for (int i2 = 0; i2 < 2; i2++) {
            ldf ldf = ldfArr2[i2];
            if (this.e.put(ldf.a(), ldf) != null) {
                String valueOf = String.valueOf(ldf.a());
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Duplicate level name ") : "Duplicate level name ".concat(valueOf));
            }
        }
    }

    public static boolean a() {
        return ((Boolean) jzq.S.c()).booleanValue();
    }

    public static synchronized void b() {
        synchronized (ldn.class) {
            if (c == null) {
                HashSet hashSet = new HashSet();
                hashSet.addAll(Arrays.asList(new Class[]{kfl.class, kfo.class, kfp.class, kfq.class, kfr.class, kfz.class, kgc.class, kgh.class, kgk.class, kgm.class, kgo.class, kgt.class, kgw.class, khb.class, khc.class, khd.class, khg.class}));
                Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
                ldf[] ldfArr = {new ldl("HIGH", ((Long) jzq.l.c()).longValue(), ((Integer) jzq.k.c()).intValue(), ((Long) jzq.m.c()).longValue()), new ldp("LOW", ((Long) jzq.i.c()).longValue(), ((Integer) jzq.h.c()).intValue(), ((Long) jzq.j.c()).longValue())};
                lsm a2 = lsm.a();
                ley ley = a2.j;
                ley ley2 = ley;
                ldn ldn = new ldn(unmodifiableSet, ley2, a2.g, a2.x, Math.max(0, Math.max(((Long) jzq.m.c()).longValue(), ((Long) jzq.j.c()).longValue())), ldfArr);
                ley.f = ldn;
                c = ldn;
            }
        }
    }

    public static ldn c() {
        ldn ldn = c;
        iva.a((Object) ldn, (Object) "Must be inited before get");
        return ldn;
    }

    public final synchronized void d() {
        for (ldj e2 : this.j.values()) {
            e2.e();
        }
    }

    public final synchronized ldj a(String str) {
        long j2;
        String str2 = str;
        synchronized (this) {
            ldj ldj = (ldj) this.j.get(str2);
            if (ldj != null) {
                return ldj;
            }
            ldg ldg = null;
            String string = ((lhy) this.g).d().getString(lhy.b(str), (String) null);
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    String string2 = jSONObject.getString("activeLevel");
                    JSONArray jSONArray = jSONObject.getJSONArray("activityHistory");
                    int length = jSONArray.length();
                    long[] jArr = new long[length];
                    long optLong = jSONObject.optLong("lastActivityLevelChangeTimestamp", -1);
                    long optLong2 = jSONObject.optLong("numPendingPushNotifications", 0);
                    for (int i2 = 0; i2 < length; i2++) {
                        jArr[i2] = jSONArray.getLong(i2);
                    }
                    ldg = new ldg(string2, jArr, optLong, optLong2);
                } catch (JSONException e2) {
                }
            }
            ldo ldo = new ldo();
            ldf ldf = a;
            if (ldg != null) {
                ldf[] ldfArr = this.d;
                int length2 = ldfArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= 2) {
                        break;
                    }
                    ldf ldf2 = ldfArr[i3];
                    if (ldf2.a().equals(ldg.a)) {
                        ldf = ldf2;
                        break;
                    }
                    i3++;
                }
                for (long a2 : ldg.b) {
                    ldo.a(a2);
                }
                j2 = ldg.d;
            } else {
                j2 = 0;
            }
            ldj ldj2 = new ldj(lsm.a().b, str, this.f, this.g, this.d, ldo, this.h, j2, this.i);
            ldj2.a(ldf);
            this.j.put(str2, ldj2);
            return ldj2;
        }
    }
}
