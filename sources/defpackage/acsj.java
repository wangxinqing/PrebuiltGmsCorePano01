package defpackage;

import android.content.Context;
import android.os.DropBoxManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: acsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acsj extends acrk {
    private final String f;

    protected acsj() {
        super("Dropbox", "DROP_BOX", aznk.b());
        this.f = "Dropbox";
    }

    public static acsj h() {
        return new acsj("DropboxRealtime");
    }

    public final void a(iby iby, hol hol, hph hph, avvz avvz, boolean z, List list, boolean z2, boolean z3, boolean z4) {
        int length;
        hph hph2 = hph;
        if (aznu.c() && aznu.f()) {
            acsq.a((avwc) avvz.i());
        }
        avwa[] avwaArr = (avwa[]) Collections.unmodifiableList(((avwc) avvz.b).i).toArray(new avwa[0]);
        if (aznk.a.a().i() && avwaArr != null && (length = avwaArr.length) > 0) {
            hph2.d("DropboxEntriesHistogram").a(length);
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                avwa avwa = avwaArr[i2];
                int i3 = i + 1;
                if (i3 <= ((int) aznk.a.a().e())) {
                    avvz avvz2 = (avvz) avvz.clone();
                    if (avvz2.c) {
                        avvz2.c();
                        avvz2.c = false;
                    }
                    avwc avwc = avwc.v;
                    ((avwc) avvz2.b).i = aucj.s();
                    avvz2.a(avwa);
                    boolean b = azoo.b();
                    boolean b2 = aznh.b();
                    String str = this.f;
                    String str2 = this.b;
                    int i4 = i3;
                    boolean z5 = b2;
                    int i5 = i2;
                    String str3 = str;
                    int i6 = length;
                    String str4 = str2;
                    acub.a(iby, hol, hph, avvz2, z, list, z2, b, z5, str3, str4, actx.a((avwc) avvz.i(), hph2).f);
                    i2 = i5 + 1;
                    avwaArr = avwaArr;
                    length = i6;
                    i = i4;
                } else {
                    hph2.c("DropboxTooManyEntries").a();
                    return;
                }
            }
        } else {
            acub.a(iby, hol, hph, avvz, z, list, z2, azoo.b(), aznh.b(), this.f, this.b, actx.a((avwc) avvz.i(), hph2).f);
        }
        if (!aznu.c() && aznu.f()) {
            acsq.a((avwc) avvz.i());
        }
    }

    /* access modifiers changed from: protected */
    public final avwc b(Context context, long j, long j2, hph hph) {
        Context context2 = context;
        hph hph2 = hph;
        DropBoxManager dropBoxManager = (DropBoxManager) context.getSystemService("dropbox");
        avvz avvz = (avvz) avwc.v.o();
        if (this.f.equals("DropboxRealtime")) {
            hph2.c("DropboxRealtimeCollection").a();
        } else if (this.f.equals("Dropbox")) {
            hph2.c("DropboxDailyCollection").a();
        }
        avvz.a((Iterable) Arrays.asList(actx.a(context, context.getSharedPreferences("com.google.android.metrics", 0), dropBoxManager, this.f, j, j2, true, hph)));
        if (avvz.c) {
            avvz.c();
            avvz.c = false;
        }
        avwc avwc = (avwc) avvz.b;
        int i = avwc.a | 1;
        avwc.a = i;
        avwc.d = j;
        avwc.a = i | 2;
        avwc.e = j2;
        boolean a = aecx.a();
        if (avvz.c) {
            avvz.c();
            avvz.c = false;
        }
        avwc avwc2 = (avwc) avvz.b;
        avwc2.a |= 262144;
        avwc2.m = a;
        dropBoxManager.addText("platform_stats_bookmark", String.valueOf(j2));
        return (avwc) avvz.i();
    }

    public final long c() {
        return aznk.a.a().h();
    }

    public final long d() {
        return 0;
    }

    public final boolean g() {
        return aznk.a.a().c();
    }

    public acsj(String str) {
        super(str, "DROP_BOX", aznk.b());
        this.f = str;
    }

    public final boolean b() {
        return azms.b();
    }
}
