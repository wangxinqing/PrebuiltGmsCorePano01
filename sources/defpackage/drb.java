package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* renamed from: drb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class drb extends Fragment {
    public final SimpleDateFormat a = new SimpleDateFormat("MMM d,yyyy h:mm a");
    public String b = "";
    TextView c;
    public View d;
    Button e;
    Button f;
    Button g;
    Button h;
    private final String i = String.format("%25.25s(%.10s) |\t%6s |\t%5s |\t%7s |\t%7s |\t%6s |\t%6s", new Object[]{"Component", "Tag", "Network", "State", "Wakeups", "TTL Lat", "TTL Evt", "TTL Fail"});

    public static final long a(aoid aoid) {
        if ((aoid.a & 512) == 0) {
            return 0;
        }
        double d2 = (double) aoid.h;
        double d3 = aoid.k;
        Double.isNaN(d2);
        return Math.round(d2 * d3);
    }

    public final Date b() {
        try {
            this.f = (Button) this.d.findViewById(R.id.end_date_button);
            this.h = (Button) this.d.findViewById(R.id.end_time_button);
            SimpleDateFormat simpleDateFormat = this.a;
            String valueOf = String.valueOf(this.f.getText());
            String valueOf2 = String.valueOf(this.h.getText());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(valueOf2);
            return simpleDateFormat.parse(String.valueOf(sb.toString()));
        } catch (ParseException e2) {
            Log.e("ShareRadioActivity", "Failed to parse text when creating end date", e2);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00db, code lost:
        android.util.Log.e("ShareRadioActivity", "Failed to parse text when creating start or end date", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e2, code lost:
        android.util.Log.e("ShareRadioActivity", "Failed to create radio activity summary log file", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e7, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00da A[ExcHandler: ParseException (r0v2 'e' java.text.ParseException A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r15 = this;
            java.lang.String r0 = " "
            java.lang.String r1 = "ShareRadioActivity"
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.lang.String r3 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.io.File r3 = android.os.Environment.getExternalStoragePublicDirectory(r3)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.lang.String r4 = "WirelessRadioActivitySummary.txt"
            r2.<init>(r3, r4)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            r2.createNewFile()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            r3.<init>(r2)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.text.SimpleDateFormat r2 = r15.a     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            android.widget.Button r4 = r15.e     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.lang.CharSequence r4 = r4.getText()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            android.widget.Button r5 = r15.g     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.lang.CharSequence r5 = r5.getText()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            int r6 = r6.length()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            int r6 = r6 + 1
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            int r7 = r7.length()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            r7.<init>(r6)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            r7.append(r4)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            r7.append(r0)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            r7.append(r5)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.lang.String r4 = r7.toString()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.util.Date r2 = r2.parse(r4)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.text.SimpleDateFormat r4 = r15.a     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            android.widget.Button r5 = r15.f     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.lang.CharSequence r5 = r5.getText()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            android.widget.Button r6 = r15.h     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.lang.CharSequence r6 = r6.getText()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            int r7 = r7.length()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            int r7 = r7 + 1
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            int r8 = r8.length()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            r8.<init>(r7)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            r8.append(r5)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            r8.append(r0)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            r8.append(r6)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.lang.String r0 = r8.toString()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.util.Date r0 = r4.parse(r0)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            long r11 = r2.getTime()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            long r13 = r0.getTime()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            boolean r0 = defpackage.axbe.e()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            if (r0 == 0) goto L_0x00d6
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            java.lang.String r0 = "GMS Core Radio Activity:\n"
            r3.write(r0)     // Catch:{ IOException -> 0x00b5, ParseException -> 0x00da }
            a((java.io.FileWriter) r3)     // Catch:{ IOException -> 0x00b5, ParseException -> 0x00da }
            java.lang.String r0 = "Lat = Latency, Med = Median, Std dev = Standard deviation, TTL = Total, Evt = Events\n"
            r3.write(r0)     // Catch:{ IOException -> 0x00b5, ParseException -> 0x00da }
            goto L_0x00bb
        L_0x00b5:
            r0 = move-exception
            java.lang.String r2 = "Failed to write to radio activity summary log file"
            android.util.Log.e(r1, r2, r0)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
        L_0x00bb:
            boolean r0 = defpackage.axbe.g()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            if (r0 != 0) goto L_0x00c2
            goto L_0x00c9
        L_0x00c2:
            r6 = 0
            r5 = r3
            r7 = r11
            r9 = r13
            a((java.io.FileWriter) r5, (int) r6, (long) r7, (long) r9)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
        L_0x00c9:
            boolean r0 = defpackage.axbe.h()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            if (r0 == 0) goto L_0x00d6
            r6 = 1
            r5 = r3
            r7 = r11
            r9 = r13
            a((java.io.FileWriter) r5, (int) r6, (long) r7, (long) r9)     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
        L_0x00d6:
            r3.close()     // Catch:{ IOException -> 0x00e1, ParseException -> 0x00da }
            return
        L_0x00da:
            r0 = move-exception
            java.lang.String r2 = "Failed to parse text when creating start or end date"
            android.util.Log.e(r1, r2, r0)
            return
        L_0x00e1:
            r0 = move-exception
            java.lang.String r2 = "Failed to create radio activity summary log file"
            android.util.Log.e(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drb.c():void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.share_wireless_radio_activity_summary, viewGroup, false);
        this.d = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.dump);
        this.c = textView;
        textView.setMovementMethod(new ScrollingMovementMethod());
        this.e = (Button) this.d.findViewById(R.id.start_date_button);
        this.f = (Button) this.d.findViewById(R.id.end_date_button);
        this.g = (Button) this.d.findViewById(R.id.start_time_button);
        this.h = (Button) this.d.findViewById(R.id.end_time_button);
        Button button = this.e;
        button.setOnClickListener(new dra(this, button, this.g, 1));
        Button button2 = this.f;
        button2.setOnClickListener(new dra(this, button2, this.h, 1));
        Button button3 = this.g;
        button3.setOnClickListener(new dra(this, this.e, button3, 2));
        Button button4 = this.h;
        button4.setOnClickListener(new dra(this, this.f, button4, 2));
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(5);
        int i3 = instance.get(2);
        int i4 = instance.get(1);
        int i5 = instance.get(11);
        int i6 = instance.get(12);
        this.e.setText(a(i2, i3, i4));
        this.f.setText(a(i2, i3, i4));
        this.g.setText(a(0, 0));
        this.h.setText(a(i5, i6));
        ((Button) this.d.findViewById(R.id.showDump)).setOnClickListener(new dqx(this));
        ((Button) this.d.findViewById(R.id.shareDump)).setOnClickListener(new dqy(this));
        return this.d;
    }

    public static String a(int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(11, i2);
        instance.set(12, i3);
        return new SimpleDateFormat("h:mm a").format(instance.getTime());
    }

    public static String a(int i2, int i3, int i4) {
        Calendar instance = Calendar.getInstance();
        instance.set(i4, i3, i2);
        return new SimpleDateFormat("MMM d, yyyy").format(instance.getTime());
    }

    public static final void a(FileWriter fileWriter) {
        try {
            fileWriter.write("  ");
        } catch (IOException e2) {
            Log.e("ShareRadioActivity", "Failed to write to radio activity summary log file", e2);
        }
    }

    public static final void a(FileWriter fileWriter, int i2, long j, long j2) {
        Integer num;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str;
        String str2;
        String a2 = jcm.a(i2);
        try {
            fileWriter.write(String.valueOf(a2).concat("\n"));
            a(fileWriter);
            List<aoid> a3 = jeo.a(j, j2, i2);
            fileWriter.write(String.valueOf(jeo.a).concat("\n"));
            if (!a3.isEmpty()) {
                Collections.sort(a3, new dqw());
                Collections.reverse(a3);
                for (aoid aoid : a3) {
                    Object[] objArr = new Object[12];
                    objArr[0] = izi.a(aoid.b);
                    String valueOf = String.valueOf(Integer.toHexString(aoid.b));
                    objArr[1] = valueOf.length() == 0 ? new String("0x") : "0x".concat(valueOf);
                    objArr[2] = a2;
                    Long l = null;
                    if ((2 & aoid.a) != 0) {
                        num = Integer.valueOf(aoid.c);
                    } else {
                        num = null;
                    }
                    objArr[3] = num;
                    if ((aoid.a & 8) != 0) {
                        l = Long.valueOf(aoid.e);
                    }
                    objArr[4] = l;
                    String str3 = " ";
                    if ((aoid.a & 16) != 0) {
                        obj = Long.valueOf(aoid.f);
                    } else {
                        obj = str3;
                    }
                    objArr[5] = obj;
                    if ((aoid.a & 128) != 0) {
                        obj2 = Long.valueOf(aoid.i);
                    } else {
                        obj2 = str3;
                    }
                    objArr[6] = obj2;
                    if ((aoid.a & 32) != 0) {
                        obj3 = Long.valueOf(aoid.g);
                    } else {
                        obj3 = str3;
                    }
                    objArr[7] = obj3;
                    if ((aoid.a & 64) != 0) {
                        obj4 = Long.valueOf(a(aoid));
                    } else {
                        obj4 = str3;
                    }
                    objArr[8] = obj4;
                    if ((aoid.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        str = String.format("%.0f", new Object[]{Double.valueOf(Math.sqrt(aoid.j))});
                    } else {
                        str = str3;
                    }
                    objArr[9] = str;
                    if ((aoid.a & 512) != 0) {
                        str2 = String.format("%.0f", new Object[]{Double.valueOf(aoid.k)});
                    } else {
                        str2 = str3;
                    }
                    objArr[10] = str2;
                    if ((aoid.a & 1024) != 0) {
                        str3 = String.format("%.0f", new Object[]{Double.valueOf(aoid.l)});
                    }
                    objArr[11] = str3;
                    fileWriter.write(String.format("%25.25s\t%10.10s\t%6s\t%5s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%6s\t%6s", objArr));
                    fileWriter.write("\n");
                }
                return;
            }
            fileWriter.write("No data\n");
        } catch (IOException e2) {
            Log.e("ShareRadioActivity", "Failed to write to radio activity summary log file", e2);
        }
    }

    public final Date a() {
        try {
            this.e = (Button) this.d.findViewById(R.id.start_date_button);
            this.g = (Button) this.d.findViewById(R.id.start_time_button);
            SimpleDateFormat simpleDateFormat = this.a;
            String valueOf = String.valueOf(this.e.getText());
            String valueOf2 = String.valueOf(this.g.getText());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(valueOf2);
            return simpleDateFormat.parse(String.valueOf(sb.toString()));
        } catch (ParseException e2) {
            Log.e("ShareRadioActivity", "Failed to parse text when creating start date", e2);
            return null;
        }
    }

    public final void a(int i2, Date date, Date date2, StringBuilder sb) {
        Integer num;
        Object obj;
        String str;
        long time = date.getTime();
        long time2 = date2.getTime();
        String a2 = jcm.a(i2);
        sb.append(a2);
        sb.append("\n");
        List<aoid> a3 = jeo.a(time, time2, i2);
        sb.append(this.i);
        sb.append("\n");
        if (a3.isEmpty()) {
            sb.append("No data\n");
            return;
        }
        for (aoid aoid : a3) {
            Object[] objArr = new Object[8];
            objArr[0] = izi.a(aoid.b);
            String valueOf = String.valueOf(Integer.toHexString(aoid.b));
            objArr[1] = valueOf.length() == 0 ? new String("0x") : "0x".concat(valueOf);
            objArr[2] = a2;
            Long l = null;
            if ((2 & aoid.a) != 0) {
                num = Integer.valueOf(aoid.c);
            } else {
                num = null;
            }
            objArr[3] = num;
            if ((8 & aoid.a) != 0) {
                l = Long.valueOf(aoid.e);
            }
            objArr[4] = l;
            String str2 = " ";
            if ((aoid.a & 64) != 0) {
                obj = Long.valueOf(a(aoid));
            } else {
                obj = str2;
            }
            objArr[5] = obj;
            if ((aoid.a & 512) != 0) {
                str = String.format("%.0f", new Object[]{Double.valueOf(aoid.k)});
            } else {
                str = str2;
            }
            objArr[6] = str;
            if ((aoid.a & 1024) != 0) {
                str2 = String.format("%.0f", new Object[]{Double.valueOf(aoid.l)});
            }
            objArr[7] = str2;
            sb.append(String.format("%25.25s(%.10s) |\t%6s |\t%5s |\t%7s |\t%7s |\t%6s |\t%6s", objArr));
            sb.append("\n");
        }
    }

    public final boolean a(Date date, Date date2) {
        if (!date.after(date2)) {
            return false;
        }
        ss b2 = new sr(getActivity()).b();
        b2.setTitle((CharSequence) "Input Error");
        b2.a.b((CharSequence) "End date must be after start date.");
        b2.a.a(-3, (CharSequence) "OK", (DialogInterface.OnClickListener) new dqz());
        b2.show();
        return true;
    }
}
