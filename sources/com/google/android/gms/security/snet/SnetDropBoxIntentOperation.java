package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import android.os.DropBoxManager;
import com.google.android.chimera.IntentOperation;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SnetDropBoxIntentOperation extends IntentOperation {
    static String a = "network_watchlist_report";
    private aaal b;
    private List c = null;

    public final void onCreate() {
        this.b = new aaal(this);
    }

    public final void onHandleIntent(Intent intent) {
        DropBoxManager dropBoxManager;
        aarw aarw;
        BufferedOutputStream bufferedOutputStream;
        DropBoxManager.Entry nextEntry;
        InputStream inputStream;
        byte[] bArr;
        if (azfv.b() && intent != null) {
            if (!this.b.a() && !azfv.j()) {
                return;
            }
            if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) || "android.intent.action.DROPBOX_ENTRY_ADDED".equals(intent.getAction())) {
                aarq aarq = new aarq(this);
                long currentTimeMillis = System.currentTimeMillis();
                long j = aarq.b.getLong("snet_last_dropbox_read_time_ms", 0);
                if (currentTimeMillis >= j && (dropBoxManager = (DropBoxManager) getSystemService("dropbox")) != null) {
                    while (j < currentTimeMillis) {
                        try {
                            nextEntry = dropBoxManager.getNextEntry((String) null, j);
                            if (nextEntry == null) {
                                break;
                            }
                            long timeMillis = nextEntry.getTimeMillis();
                            if (this.c == null) {
                                this.c = Arrays.asList(a.split(","));
                            }
                            if (this.c.contains(nextEntry.getTag())) {
                                try {
                                    aatw aatw = aatw.a;
                                    aucd o = aarv.e.o();
                                    long timeMillis2 = nextEntry.getTimeMillis();
                                    if (o.c) {
                                        o.c();
                                        o.c = false;
                                    }
                                    aarv aarv = (aarv) o.b;
                                    aarv.a |= 1;
                                    aarv.b = timeMillis2;
                                    String tag = nextEntry.getTag();
                                    if (o.c) {
                                        o.c();
                                        o.c = false;
                                    }
                                    aarv aarv2 = (aarv) o.b;
                                    tag.getClass();
                                    aarv2.a |= 2;
                                    aarv2.c = tag;
                                    inputStream = nextEntry.getInputStream();
                                    if (inputStream == null) {
                                        bArr = new byte[0];
                                    } else {
                                        byte[] bArr2 = new byte[81920];
                                        int i = 0;
                                        int i2 = 0;
                                        while (i >= 0) {
                                            i2 += i;
                                            if (i2 >= 81920) {
                                                break;
                                            }
                                            i = inputStream.read(bArr2, i2, 81920 - i2);
                                        }
                                        if (i2 < 81920) {
                                            byte[] copyOf = Arrays.copyOf(bArr2, i2);
                                            inputStream.close();
                                            bArr = copyOf;
                                        } else {
                                            inputStream.close();
                                            bArr = bArr2;
                                        }
                                    }
                                    auay a2 = auay.a(bArr);
                                    if (o.c) {
                                        o.c();
                                        o.c = false;
                                    }
                                    aarv aarv3 = (aarv) o.b;
                                    a2.getClass();
                                    aarv3.a |= 4;
                                    aarv3.d = a2;
                                    aarv aarv4 = (aarv) o.i();
                                    aucd o2 = aaru.c.o();
                                    if (o2.c) {
                                        o2.c();
                                        o2.c = false;
                                    }
                                    aaru aaru = (aaru) o2.b;
                                    aarv4.getClass();
                                    aaru.b = aarv4;
                                    aaru.a |= 1;
                                    aatw.c.add((aaru) o2.i());
                                } catch (IOException e) {
                                } catch (Throwable th) {
                                    apev.a(th, th);
                                }
                            }
                            nextEntry.close();
                            j = timeMillis;
                        } catch (RuntimeException | SecurityException e2) {
                        } catch (Throwable th2) {
                            apev.a(th, th2);
                        }
                    }
                    aatw aatw2 = aatw.a;
                    if (!aatw2.c.isEmpty()) {
                        synchronized (aatw2.b) {
                            try {
                                aarw = aatw2.a(aatw2.a((Context) this));
                            } catch (IOException e3) {
                                aarw = aarw.b;
                            }
                            aarw a3 = aatw2.a(aarw);
                            int i3 = a3.U;
                            if (i3 == -1) {
                                i3 = aueh.a.a((Object) a3).b(a3);
                                a3.U = i3;
                            }
                            if (((long) i3) <= aans.b) {
                                aarw = a3;
                            }
                            File file = new File(String.valueOf(getApplicationInfo().dataDir).concat("/snet"));
                            if (!file.exists()) {
                                if (!file.mkdir()) {
                                }
                            }
                            try {
                                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(file, "cachedlogs")));
                                bufferedOutputStream.write(aarw.k());
                                bufferedOutputStream.flush();
                                bufferedOutputStream.close();
                            } catch (IOException e4) {
                            } catch (Throwable th3) {
                                apev.a(th, th3);
                            }
                        }
                    }
                    aarq.a(aarq.b, "snet_last_dropbox_read_time_ms", currentTimeMillis);
                    return;
                }
                return;
            }
            return;
        }
        return;
        throw th;
        throw th;
        throw th;
    }
}
