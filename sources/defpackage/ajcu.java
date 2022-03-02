package defpackage;

import android.content.Context;
import android.media.RingtoneManager;
import android.os.Vibrator;
import com.google.android.gms.R;
import java.io.File;
import java.util.Date;
import java.util.Locale;

/* renamed from: ajcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajcu {
    private static int a = 0;

    public static File a(Context context) {
        File file = new File(context.getFilesDir(), "qaccelmonitor");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Context r6, java.lang.String r7) {
        /*
            r0 = 0
            java.io.File r6 = a(r6)     // Catch:{ all -> 0x0064 }
            r1 = 1
            if (r6 == 0) goto L_0x0039
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0064 }
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = "yyyy.MM.dd"
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0064 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0064 }
            java.util.Date r4 = new java.util.Date     // Catch:{ all -> 0x0064 }
            r4.<init>()     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = r3.format(r4)     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = ".txt"
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x0064 }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x0064 }
            java.io.PrintWriter r6 = new java.io.PrintWriter     // Catch:{ IOException -> 0x0037 }
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ IOException -> 0x0037 }
            r3.<init>(r2, r1)     // Catch:{ IOException -> 0x0037 }
            r6.<init>(r3)     // Catch:{ IOException -> 0x0037 }
            r0 = r6
            goto L_0x003a
        L_0x0037:
            r6 = move-exception
            goto L_0x003a
        L_0x0039:
        L_0x003a:
            if (r0 == 0) goto L_0x0063
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0061 }
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = "yyyy.MM.dd HH:mm:ss:SSS"
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0061 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0061 }
            java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x0061 }
            r3.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = r2.format(r3)     // Catch:{ all -> 0x0061 }
            r3 = 0
            r6[r3] = r2     // Catch:{ all -> 0x0061 }
            r6[r1] = r7     // Catch:{ all -> 0x0061 }
            java.lang.String r7 = "%s %s\n"
            r0.printf(r7, r6)     // Catch:{ all -> 0x0061 }
            r0.close()
            return
        L_0x0061:
            r6 = move-exception
            goto L_0x0065
        L_0x0063:
            return
        L_0x0064:
            r6 = move-exception
        L_0x0065:
            if (r0 == 0) goto L_0x006a
            r0.close()
        L_0x006a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajcu.a(android.content.Context, java.lang.String):void");
    }

    static void a(Context context, String str, ajfm ajfm) {
        if (ayek.l()) {
            ajfm a2 = ajfm.a(ajdg.a(context), System.currentTimeMillis());
            a(context, String.format(Locale.ENGLISH, "%s rep:%d thr:%d dt:%d b:%d db:%d", new Object[]{str, Integer.valueOf(a2.g), Integer.valueOf(a2.f), Long.valueOf(a2.c), Integer.valueOf(a2.d), Integer.valueOf(a2.e)}));
        }
    }

    static void a(Context context, boolean z) {
        if (ayek.a.a().seismicDebugNotification() && z) {
            je jeVar = new je(context);
            String valueOf = String.valueOf(new Date());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
            sb.append("quake @");
            sb.append(valueOf);
            jeVar.e(sb.toString());
            jeVar.a(true);
            jeVar.a(RingtoneManager.getDefaultUri(2));
            jeVar.j = 0;
            jeVar.a(4);
            jeVar.b(hdg.a(context, R.drawable.ic_location_on));
            iwr a2 = iwr.a(context);
            int i = a;
            a = i + 1;
            a2.a("pRPjL/2tRYajMFexaPiqUA", i, jeVar.b());
            ((Vibrator) context.getSystemService("vibrator")).vibrate(new long[]{0, 250, 250, 250, 250, 250, 250}, -1);
        }
        if (ayek.l()) {
            a(context, String.format(Locale.ENGLISH, "event (%b)", new Object[]{Boolean.valueOf(z)}));
        }
    }
}
