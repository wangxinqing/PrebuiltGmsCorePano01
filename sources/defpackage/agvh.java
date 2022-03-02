package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* renamed from: agvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agvh {
    public static final amri a(Context context) {
        amri amri;
        BufferedReader bufferedReader;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        String str3 = Build.HARDWARE;
        if ((!str.equals("eng") && !str.equals("userdebug")) || ((!str3.equals("goldfish") && !str3.equals("ranchu") && !str3.equals("robolectric")) || (!str2.contains("dev-keys") && !str2.contains("test-keys")))) {
            return ampu.a;
        }
        Context d = aekv.d(context);
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            File file = new File(d.getDir("phenotype_hermetic", 0), "overrides.txt");
            if (file.exists()) {
                amri = amri.b(file);
            } else {
                amri = ampu.a;
            }
        } catch (RuntimeException e) {
            Log.e("HermeticFileOverrides", "no data dir", e);
            amri = ampu.a;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (!amri.a()) {
            return ampu.a;
        }
        File file2 = (File) amri.b();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    String valueOf = String.valueOf(file2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
                    sb.append("Parsed ");
                    sb.append(valueOf);
                    Log.i("HermeticFileOverrides", sb.toString());
                    agvg agvg = new agvg(hashMap);
                    bufferedReader.close();
                    return amri.b(agvg);
                }
                String[] split = readLine.split(" ", 3);
                if (split.length == 3) {
                    String str4 = split[0];
                    String decode = Uri.decode(split[1]);
                    String decode2 = Uri.decode(split[2]);
                    if (!hashMap.containsKey(str4)) {
                        hashMap.put(str4, new HashMap());
                    }
                    ((Map) hashMap.get(str4)).put(decode, decode2);
                } else {
                    Log.e("HermeticFileOverrides", readLine.length() == 0 ? new String("Invalid: ") : "Invalid: ".concat(readLine));
                }
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
        throw th;
    }
}
