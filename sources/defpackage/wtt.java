package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.R;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* renamed from: wtt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wtt {
    private static wtt d;
    public String[] a;
    public short[] b;
    public boolean c;

    private wtt(Context context) {
        int read;
        System.currentTimeMillis();
        Resources resources = context.getResources();
        BufferedInputStream bufferedReader = new BufferedReader(new InputStreamReader(resources.openRawResource(R.raw.pinyins)));
        try {
            int parseInt = Integer.parseInt(bufferedReader.readLine());
            this.a = new String[parseInt];
            int i = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                this.a[i] = readLine;
                i++;
            }
            if (i == parseInt) {
                jjt.a((Closeable) bufferedReader);
                bufferedReader = new BufferedInputStream(resources.openRawResource(R.raw.indexes));
                try {
                    byte[] bArr = new byte[41984];
                    int i2 = 0;
                    do {
                        read = bufferedReader.read(bArr, i2, 41984 - i2);
                        i2 += read;
                        if (read == -1 || read + i2 == 41984) {
                            this.b = new short[20992];
                        }
                        read = bufferedReader.read(bArr, i2, 41984 - i2);
                        i2 += read;
                        break;
                    } while (read + i2 == 41984);
                    this.b = new short[20992];
                    for (int i3 = 0; i3 < 20992; i3++) {
                        int i4 = i3 + i3;
                        short s = (short) ((bArr[i4 + 1] & 255) | (bArr[i4] << 8));
                        if (s < 0 || s >= this.a.length) {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append("Invalid character to pinyin index: ");
                            sb.append(i3);
                            throw new RuntimeException(sb.toString());
                        }
                        this.b[i3] = s;
                    }
                    jjt.a((Closeable) bufferedReader);
                    System.currentTimeMillis();
                    this.c = true;
                } catch (Exception e) {
                    xdt.b("PeoplePinyin", "Malformed or missing indexes.txt for HanziPinyin. %s", e.getMessage());
                    this.c = false;
                    this.a = null;
                    this.b = null;
                } catch (Throwable th) {
                    jjt.a((Closeable) bufferedReader);
                    throw th;
                }
            } else {
                throw new RuntimeException("Mismatched counts.");
            }
        } catch (Exception e2) {
            xdt.b("PeoplePinyin", "Malformed or missing input files for HanziPinyin. %s", e2.getMessage());
            this.c = false;
            this.a = null;
            this.b = null;
        } finally {
            jjt.a((Closeable) bufferedReader);
        }
    }

    public static synchronized wtt a(Context context) {
        wtt wtt;
        synchronized (wtt.class) {
            if (d == null) {
                d = new wtt(context);
            }
            wtt = d;
        }
        return wtt;
    }

    public static final void a(StringBuilder sb, ArrayList arrayList, int i) {
        String sb2 = sb.toString();
        arrayList.add(new wts(i, sb2, sb2));
        sb.setLength(0);
    }
}
