package defpackage;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.stats.PlatformStatsCollectorChimeraService;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: acst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acst extends acsr {
    static final amsk a = amsk.a(',').a();
    static final Map f = new HashMap(PlatformStatsCollectorChimeraService.a);
    public static acst g = null;

    public final void a(int i, boolean z, boolean z2, aucd aucd) {
        String str;
        String str2;
        int i2;
        String str3;
        if (!azof.a.a().b()) {
            c.c("DisabledEastworldProcessorEastworldTrigger").a();
            c.d();
            return;
        }
        boolean z3 = true;
        if (i == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            anax a2 = anax.a((Collection) a.c(azof.b()));
            amzt j = amzy.j();
            for (String str4 : f.keySet()) {
                if (a2.contains(str4)) {
                    j.c((acrk) f.get(str4));
                }
            }
            amzy a3 = j.a();
            SharedPreferences.Editor edit = d.edit();
            int size = a3.size();
            int i3 = 0;
            while (true) {
                str = ":taskLastRunElapsedTime";
                if (i3 >= size) {
                    break;
                }
                String str5 = ((acrk) a3.get(i3)).a;
                String concat = String.valueOf(str5).concat(":taskLastRunWallClockTime");
                String concat2 = String.valueOf(str5).concat(str);
                if (!d.contains(concat) || !d.contains(concat2)) {
                    long nextInt = (long) new Random().nextInt((int) TimeUnit.DAYS.toMillis(1));
                    edit.putLong(concat, currentTimeMillis - nextInt);
                    edit.putLong(concat2, elapsedRealtime - nextInt);
                }
                i3++;
            }
            edit.apply();
            int i4 = d.getInt(":eastworldTriggerProcessorBootCount", 0);
            int a4 = acso.a(c);
            if (i4 != a4) {
                if (a4 >= 0) {
                    SharedPreferences.Editor edit2 = d.edit();
                    edit2.putInt(":eastworldTriggerProcessorBootCount", a4);
                    edit2.apply();
                }
                z3 = false;
            }
            amzt j2 = amzy.j();
            int size2 = a3.size();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i5 >= size2) {
                    str2 = str;
                    break;
                }
                acrk acrk = (acrk) a3.get(i5);
                if (acrk != null) {
                    String concat3 = String.valueOf(acrk.a).concat(":taskLastRunWallClockTime");
                    String concat4 = String.valueOf(acrk.a).concat(str);
                    i2 = i5;
                    str2 = str;
                    long j3 = d.getLong(concat3, -1);
                    long j4 = d.getLong(concat4, -1);
                    if (z3) {
                        if (elapsedRealtime - j4 < acrk.c() * 1000) {
                            str3 = str2;
                        }
                    } else if (currentTimeMillis - j3 < acrk.c() * 1000) {
                        str3 = str2;
                    }
                    j2.c(acrk);
                    i6++;
                    if (i6 >= ((int) aznq.a.a().j())) {
                        break;
                    }
                    str3 = str2;
                } else {
                    i2 = i5;
                    str3 = str;
                }
                str = str3;
                i5 = i2 + 1;
            }
            amzy a5 = j2.a();
            ihs b = ihs.b();
            anhk i7 = a5.listIterator();
            while (i7.hasNext()) {
                acrk acrk2 = (acrk) i7.next();
                if (acrk2 != null) {
                    String str6 = acrk2.a;
                    if (!str6.equals("UnifiedDumpsysTask")) {
                        acub.b(str6, acrk2, b);
                    } else {
                        SharedPreferences sharedPreferences = ihs.b().getSharedPreferences("com.google.android.metrics", 0);
                        for (String str7 : amsk.a(',').a().c(azof.b())) {
                            if (str7.endsWith("PH")) {
                                String string = sharedPreferences.getString(String.valueOf(str7).concat("_collection_config"), "");
                                if (string.length() >= 5) {
                                    try {
                                        avvp avvp = (avvp) aucj.a((aucj) avvp.l, Base64.decode(string, 0), aubs.c());
                                        hph hph = c;
                                        String valueOf = String.valueOf(str7);
                                        hph.c(valueOf.length() == 0 ? new String("CollectionConfigParseEnablePostV16") : "CollectionConfigParseEnablePostV16".concat(valueOf)).a();
                                        acrr acrr = new acrr(str7, avvp);
                                        if (acrr.h != 0) {
                                            f.put(str7, acrr);
                                        } else {
                                            f.remove(str7);
                                        }
                                    } catch (auda | IllegalArgumentException e) {
                                        hph hph2 = c;
                                        String valueOf2 = String.valueOf(str7);
                                        hph2.c(valueOf2.length() == 0 ? new String("UnifiedTaskConfigDeserializationException") : "UnifiedTaskConfigDeserializationException".concat(valueOf2)).a();
                                        Log.e("EastworldTrigger", "Fail to de-serialize proto", e);
                                    }
                                } else {
                                    f.remove(str7);
                                }
                            }
                        }
                    }
                    SharedPreferences.Editor edit3 = d.edit();
                    String concat5 = String.valueOf(str6).concat(":taskLastRunWallClockTime");
                    String concat6 = String.valueOf(str6).concat(str2);
                    edit3.putLong(concat5, currentTimeMillis);
                    edit3.putLong(concat6, elapsedRealtime);
                    edit3.apply();
                } else {
                    String str8 = str2;
                }
            }
        }
    }
}
