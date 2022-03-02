package com.google.android.gms.clearcut.debug;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ClearcutDebugDumpChimeraService extends Service {
    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        PrintWriter printWriter2 = printWriter;
        amzy b = hvk.c().b();
        int size = b.size();
        int i2 = 0;
        while (true) {
            long j = 0;
            if (i2 >= size) {
                break;
            }
            hvg hvg = (hvg) b.get(i2);
            Map f = hvg.f();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : f.entrySet()) {
                String b2 = hwt.b((avtn) entry.getKey());
                hashMap.put(b2, Long.valueOf((hashMap.containsKey(b2) ? ((Long) hashMap.get(b2)).longValue() : j) + ((huy) entry.getValue()).a));
                j = 0;
            }
            printWriter2.print("Clearcut log storage:");
            printWriter2.println(hvg.k());
            TreeSet treeSet = new TreeSet(hpn.a);
            treeSet.addAll(hashMap.entrySet());
            Iterator it = treeSet.iterator();
            while (true) {
                i = i2 + 1;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                String str = (String) entry2.getKey();
                String valueOf = String.valueOf(entry2.getValue());
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(valueOf).length());
                sb.append(str);
                sb.append(": ");
                sb.append(valueOf);
                sb.append(" bytes");
                printWriter2.println(sb.toString());
            }
            i2 = i;
        }
        printWriter.println();
        long j2 = new hwp(this).a.getSharedPreferences("timing_control_pref", 0).getLong("last_record_wall_time_millis", 0);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j2);
        String valueOf2 = String.valueOf(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(instance.getTime()));
        printWriter2.println(valueOf2.length() == 0 ? new String("Last upload time:") : "Last upload time:".concat(valueOf2));
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
