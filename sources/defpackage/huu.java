package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import android.util.LruCache;
import java.io.Closeable;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: huu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class huu implements Closeable {
    final Set a = new ob();
    boolean b = false;
    final Map c = new nz();
    final /* synthetic */ huv d;

    public huu(huv huv) {
        this.d = huv;
    }

    private final void a() {
        SharedPreferences sharedPreferences = this.d.d.getSharedPreferences("LogDropPref", 0);
        synchronized (this.d.c) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            int i = 0;
            for (Map.Entry entry : this.c.entrySet()) {
                i += ((Integer) entry.getValue()).intValue();
                edit.putInt((String) entry.getKey(), sharedPreferences.getInt((String) entry.getKey(), 0) + ((Integer) entry.getValue()).intValue());
            }
            if (!edit.commit()) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Failed to record ");
                sb.append(i);
                sb.append(" dropped logs");
                Log.e("FlatFileLogStore", sb.toString());
            }
        }
        this.c.clear();
    }

    public final void close() {
        int i;
        if (!this.b) {
            this.b = true;
            if (!this.c.isEmpty()) {
                a();
            }
            for (File file : this.a) {
                if (file.isDirectory()) {
                    String name = file.getParentFile().getName();
                    huq a2 = huq.a(file);
                    String[] strArr = a2.b;
                    if (strArr == null || strArr.length <= 1) {
                        Iterator it = a2.iterator();
                        while (it.hasNext()) {
                            File a3 = ((hup) it).next();
                            long length = a3.length();
                            boolean equals = a3.getName().equals("play_logger_context.pb");
                            if (!equals) {
                                i = huv.c(a3);
                            } else {
                                i = 0;
                            }
                            if (!a3.delete()) {
                                Log.e("FlatFileLogStore", String.valueOf(a3.getAbsolutePath()).concat(" could not be deleted."));
                            } else if (!equals) {
                                this.d.a(name, -length);
                                this.d.c(name, -1);
                                this.d.a(name, (hvd) hum.DIR_HAS_NO_PLC_FILE, i);
                            }
                        }
                        if (!file.delete()) {
                            Log.e("FlatFileLogStore", String.valueOf(file.getAbsolutePath()).concat(" could not be deleted."));
                        } else {
                            this.d.b(name, -1);
                            try {
                                int parseInt = Integer.parseInt(file.getName());
                                LruCache lruCache = this.d.f;
                                Integer valueOf = Integer.valueOf(parseInt);
                                lruCache.remove(valueOf);
                                this.d.g.remove(valueOf);
                            } catch (NumberFormatException e) {
                                String valueOf2 = String.valueOf(file.getName());
                                Log.e("FlatFileLogStore", valueOf2.length() == 0 ? new String("Failed to parse to int ") : "Failed to parse to int ".concat(valueOf2));
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(File file) {
        if (!this.b) {
            long length = file.length();
            boolean delete = file.delete();
            String name = file.getParentFile().getParentFile().getName();
            if (!delete) {
                Log.e("FlatFileLogStore", String.valueOf(file.getAbsolutePath()).concat(" could not be deleted."));
                return;
            }
            this.d.a(name, -length);
            this.d.c(name, -1);
            this.a.add(file.getParentFile());
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(File file, String str, hvd hvd, int i) {
        if (!this.b) {
            long length = file.length();
            boolean delete = file.delete();
            if (!delete) {
                Log.e("FlatFileLogStore", String.valueOf(file.getAbsolutePath()).concat(" could not be deleted."));
            } else {
                this.d.a(str, -length);
                this.d.c(str, -1);
                hsa.a(str, hvd.a(), i);
                String valueOf = String.valueOf(hvd);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
                sb.append(str);
                sb.append(",");
                sb.append(valueOf);
                String sb2 = sb.toString();
                Integer num = (Integer) this.c.get(sb2);
                if (num == null) {
                    this.c.put(sb2, Integer.valueOf(i));
                } else {
                    this.c.put(sb2, Integer.valueOf(num.intValue() + i));
                }
                if (((ou) this.c).h > 100) {
                    a();
                }
                this.a.add(file.getParentFile());
            }
            return delete;
        }
        throw new IllegalStateException();
    }
}
