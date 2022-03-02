package defpackage;

import android.app.Application;
import android.provider.Settings;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;

/* renamed from: agkz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agkz {
    public final aekn a;
    private final int b;
    private final double c;
    private final String d = agjs.a();
    private final String e;

    public agkz(aekn aekn, amri amri, Application application) {
        this.a = aekn;
        aghn aghn = (aghn) ((agha) amri.b()).a.b();
        this.c = aghn.f;
        this.b = aghn.c;
        this.e = Settings.Secure.getString(application.getContentResolver(), "android_id");
    }

    /* access modifiers changed from: package-private */
    public final Long a(long j) {
        int i = 0;
        Random random = new Random((long) Objects.hash(new Object[]{Long.valueOf(j), this.e, this.d}));
        double nextDouble = random.nextDouble();
        double d2 = this.c;
        if (d2 >= 1.0d) {
            i = (int) Math.min(Math.round((d2 + d2) * nextDouble), 2147483646);
        } else if (nextDouble < d2) {
            i = 1;
        }
        long j2 = 31557600000L + j;
        int i2 = this.b;
        long j3 = (j2 - j) - ((long) (i2 + i2));
        TreeSet treeSet = new TreeSet();
        while (treeSet.size() < i) {
            long abs = (Math.abs(Math.max(random.nextLong(), -9223372036854775807L)) % j3) + j;
            long j4 = (long) this.b;
            long j5 = j4 + j4;
            if (treeSet.subSet(Long.valueOf(abs - j5), Long.valueOf(j5 + abs)).isEmpty()) {
                treeSet.add(Long.valueOf(abs));
            }
        }
        Long l = (Long) treeSet.ceiling(Long.valueOf(System.currentTimeMillis() + 100));
        if (l != null) {
            return l;
        }
        if (j < System.currentTimeMillis()) {
            return a(j2);
        }
        return null;
    }
}
