package defpackage;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: aamy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aamy {
    public static boolean a() {
        Throwable th;
        BufferedReader bufferedReader;
        IOException e;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        BufferedReader bufferedReader2 = null;
        try {
            int myPid = Process.myPid();
            StringBuilder sb = new StringBuilder(24);
            sb.append("/proc/");
            sb.append(myPid);
            sb.append("/status");
            String sb2 = sb.toString();
            allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            bufferedReader = new BufferedReader(new FileReader(sb2));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    String trim = readLine.trim();
                    if (trim.startsWith("Groups:")) {
                        String[] split = trim.substring(7).trim().split("\\s", -1);
                        int length = split.length;
                        boolean z = false;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            try {
                                long parseLong = Long.parseLong(split[i]);
                                if (parseLong >= 1000 && parseLong < 2000) {
                                    z = true;
                                    break;
                                }
                            } catch (NumberFormatException e2) {
                            }
                            i++;
                        }
                        jjt.a((Closeable) bufferedReader);
                        return z;
                    }
                }
                throw new aamx("Missing Groups entry from proc/pid/status.");
            } catch (IOException e3) {
                e = e3;
                try {
                    throw new aamx("Unable to access /proc/pid/status.", e);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    jjt.a((Closeable) bufferedReader2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = bufferedReader;
                jjt.a((Closeable) bufferedReader2);
                throw th;
            }
        } catch (IOException e4) {
            bufferedReader = null;
            e = e4;
            throw new aamx("Unable to access /proc/pid/status.", e);
        } catch (Throwable th4) {
            th = th4;
            jjt.a((Closeable) bufferedReader2);
            throw th;
        }
    }
}
