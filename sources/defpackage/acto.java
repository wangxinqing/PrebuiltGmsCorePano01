package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: acto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acto extends actp {
    private static final anaf h;

    static {
        anab h2 = anaf.h();
        h2.a("MISC", new String[]{"vers", "period", "config"});
        h2.a("PKG_PROC_DUR", new String[]{"pkgproc"});
        h2.a("PKG_PROC_MEM", new String[]{"pkgpss"});
        h2.a("PKG_PROC_KILL", new String[]{"pkgkills"});
        h2.a("PKG_PROC_ALL", new String[]{"pkgproc", "pkgpss", "pkgkills"});
        h2.a("PROC_DUR", new String[]{"proc"});
        h2.a("PROC_MEM", new String[]{"pss"});
        h2.a("PROC_KILL", new String[]{"kills"});
        h2.a("PROC_ALL", new String[]{"proc", "pss", "kills"});
        h2.a("PKG_SVC_RUN", new String[]{"pkgsvc-run"});
        h2.a("PKG_SVC_START", new String[]{"pkgsvc-start"});
        h2.a("PKG_SVC_BOUND", new String[]{"pkgsvc-bound"});
        h2.a("PKG_SVC_EXEC", new String[]{"pkgsvc-exec"});
        h2.a("PKG_SVC_ALL", new String[]{"pkgsvc-run", "pkgsvc-start", "pkgsvc-bound", "pkgsvc-exec"});
        h2.a("DEVICE_MEM_DUR", new String[]{"total"});
        h2.a("SYS_MEM_USAGE", new String[]{"sysmemusage"});
        h2.a("MEM_WEIGHTS", new String[]{"weights"});
        h2.a("MEM_PAGE_STATS", new String[]{"availablepages"});
        h2.a("SYS_MEM_ALL", new String[]{"total", "sysmemusage", "weights", "availablepages"});
        h = h2.a();
    }

    public acto() {
        super("Procstats", "procstats", "PROC_STATS", aznn.a.a().j());
    }

    public final String[] a(long j, long j2) {
        return new String[]{"-c", "--hours", String.valueOf(TimeUnit.HOURS.convert(j2 - j, TimeUnit.MILLISECONDS))};
    }

    public final avwc b(Context context, InputStream inputStream, long j, long j2, hph hph) {
        ByteArrayInputStream byteArrayInputStream;
        InputStream inputStream2;
        if (azoc.a.a().a()) {
            HashSet hashSet = new HashSet();
            for (String trim : amsk.a(',').a((CharSequence) azoc.a.a().b())) {
                String trim2 = trim.trim();
                if (h.containsKey(trim2)) {
                    Collections.addAll(hashSet, (String[]) h.get(trim2));
                }
            }
            try {
                inputStream2 = inputStream;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String trim3 = readLine.trim();
                        if (!trim3.isEmpty()) {
                            int indexOf = trim3.indexOf(44);
                            if (indexOf != -1) {
                                if (hashSet.contains(trim3.substring(0, indexOf))) {
                                }
                            }
                            sb.append(trim3);
                            sb.append(10);
                        }
                    }
                    byteArrayInputStream = new ByteArrayInputStream(sb.toString().getBytes(acrk.e));
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                inputStream2 = inputStream;
            }
        } else {
            inputStream2 = inputStream;
            byteArrayInputStream = inputStream2;
        }
        return a(context, byteArrayInputStream, j, j2, hph);
    }

    public final long c() {
        return aznn.a.a().k();
    }

    public final boolean h() {
        return aznn.a.a().i();
    }

    public final boolean b() {
        int i = Build.VERSION.SDK_INT;
        return azms.a.a().j();
    }
}
