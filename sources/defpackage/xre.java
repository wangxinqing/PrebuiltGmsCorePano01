package defpackage;

import android.view.View;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: xre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xre extends jfx {
    final /* synthetic */ View a;
    final /* synthetic */ xrf e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xre(xrf xrf, View view) {
        super(9);
        this.e = xrf;
        this.a = view;
    }

    public final void run() {
        ArrayList arrayList;
        int i;
        String concat = String.valueOf(this.e.a.c).concat(".USER_INITIATED_FEEDBACK_REPORT");
        mwc mwc = new mwc();
        mwc.c = concat;
        xdt.a("DebugUploadButtonListener", "Begin data capture for uploader '%s'", (Object) this.e.a.a);
        xdt.a("DebugUploadButtonListener", "Feedback Category = %s", (Object) concat);
        xip.a();
        if (Boolean.valueOf(ayrg.a.a().a()).booleanValue()) {
            xrf xrf = this.e;
            wum wum = xrf.a;
            icc icc = xrf.b;
            arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            anhk i2 = wum.a().listIterator();
            int i3 = 0;
            while (i2.hasNext()) {
                wuk wuk = (wuk) i2.next();
                try {
                    wuj a2 = wuk.a(icc);
                    int a3 = a2.a();
                    if (a3 != -1) {
                        arrayList2.add(a2);
                        i3 += a3;
                    }
                    try {
                        Map c = a2.c();
                        if (c != null) {
                            String concat2 = String.valueOf(wuk.a()).concat("_");
                            for (Map.Entry entry : c.entrySet()) {
                                String valueOf = String.valueOf(concat2);
                                String valueOf2 = String.valueOf((String) entry.getKey());
                                arrayList.add(wuq.a(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2), (String) entry.getValue()));
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        apev.a((Throwable) e, new PrintWriter(new StringWriter()));
                        new Object[1][0] = wuk.a();
                        arrayList.add(wum.a(e, wuk.a()));
                    }
                } catch (Exception e3) {
                    e = e3;
                    apev.a((Throwable) e, new PrintWriter(new StringWriter()));
                    new Object[1][0] = wuk.a();
                    arrayList.add(wum.a(e, wuk.a()));
                }
            }
            if (!arrayList2.isEmpty()) {
                int size = arrayList2.size();
                if (i3 >= 7340032) {
                    int i4 = i3 / size;
                    i = 7340032 / size;
                } else {
                    i = Integer.MAX_VALUE;
                }
                int size2 = arrayList2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    wuj wuj = (wuj) arrayList2.get(i5);
                    try {
                        arrayList.add(wuq.a(wuj.b(), wuj.a(i)));
                        if (wuj.a() > i) {
                            arrayList.add(wuq.a(String.valueOf(wuj.b()).concat("_original_size"), Integer.toString(wuj.a())));
                        }
                    } catch (Exception e4) {
                        new Object[1][0] = wuj.b();
                        arrayList.add(wum.a(e4, wuj.b()));
                    }
                }
            }
        } else {
            xrf xrf2 = this.e;
            wum wum2 = xrf2.a;
            icc icc2 = xrf2.b;
            arrayList = new ArrayList();
            anhk i6 = wum2.a().listIterator();
            while (i6.hasNext()) {
                wuk wuk2 = (wuk) i6.next();
                try {
                    try {
                        arrayList.add(wuq.a(wuk2.a(), wuk2.a(icc2).a(Integer.MAX_VALUE)));
                    } catch (Exception e5) {
                        e = e5;
                    }
                } catch (Exception e6) {
                    e = e6;
                    StringWriter stringWriter = new StringWriter();
                    apev.a((Throwable) e, new PrintWriter(stringWriter));
                    new Object[1][0] = wuk2.a();
                    arrayList.add(wuq.a(String.valueOf(wuk2.a()).concat("_error"), stringWriter.toString()));
                }
            }
        }
        int size3 = arrayList.size();
        for (int i7 = 0; i7 < size3; i7++) {
            wuq wuq = (wuq) arrayList.get(i7);
            String str = wuq.b;
            if (str != null) {
                mwc.a(wuq.a, str);
                xdt.a("DebugUploadButtonListener", "Text PSD: %s=%s", (Object) wuq.a, (Object) wuq.b);
            } else {
                byte[] bArr = wuq.c;
                if (bArr != null) {
                    String str2 = wuq.a;
                    mwc.a(false);
                    mwc.d.add(new FileTeleporter(bArr, "text/plain", str2));
                    xdt.a("DebugUploadButtonListener", "Binary PSD len: %s=%s", (Object) wuq.a, (Object) Integer.valueOf(wuq.c.length));
                }
            }
        }
        xdt.a("DebugUploadButtonListener", "Capture for uploader '%s' finished", (Object) this.e.a.a);
        this.a.post(new xrd(this, mwc.a()));
    }
}
