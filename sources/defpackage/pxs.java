package defpackage;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: pxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxs {
    public final Context a;
    public final String b;
    private final jku c;

    public static Iterator a(ParcelFileDescriptor parcelFileDescriptor) {
        auef auef = (auef) ovc.m.c(7);
        if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
            return Collections.emptyList().iterator();
        }
        return new jkv(new FileInputStream(parcelFileDescriptor.getFileDescriptor()), parcelFileDescriptor.getStatSize(), ovc.class, auef);
    }

    public final void b() {
        this.c.a();
    }

    public pxs(Context context, String str) {
        this.c = new jku(context, str);
        this.a = context;
        this.b = str;
    }

    public static ovc a(UsageInfo usageInfo, String str, long j, List list) {
        oqo oqo;
        int indexOf;
        UsageInfo usageInfo2 = usageInfo;
        String str2 = str;
        long j2 = j;
        List list2 = list;
        DocumentId documentId = usageInfo2.a;
        aucd o = ovc.m.o();
        boolean z = false;
        if (o.c) {
            o.c();
            o.c = false;
        }
        ovc ovc = (ovc) o.b;
        str.getClass();
        int i = ovc.a | 1;
        ovc.a = i;
        ovc.b = str2;
        int i2 = i | 2;
        ovc.a = i2;
        ovc.c = j2;
        String str3 = documentId.a;
        str3.getClass();
        int i3 = i2 | 4;
        ovc.a = i3;
        ovc.d = str3;
        String str4 = documentId.b;
        str4.getClass();
        int i4 = i3 | 8;
        ovc.a = i4;
        ovc.e = str4;
        String str5 = documentId.c;
        str5.getClass();
        int i5 = i4 | 16;
        ovc.a = i5;
        ovc.f = str5;
        long j3 = usageInfo2.b;
        ovc.a = i5 | 32;
        ovc.g = j3;
        ovg ovg = (ovg) amrh.a(ovg.a(usageInfo2.c), ovg.GENERAL_USE);
        if (o.c) {
            o.c();
            o.c = false;
        }
        ovc ovc2 = (ovc) o.b;
        ovc2.h = ovg.g;
        int i6 = ovc2.a | 64;
        ovc2.a = i6;
        boolean z2 = usageInfo2.f;
        ovc2.a = i6 | 512;
        ovc2.k = z2;
        otk otk = (otk) amrh.a(otk.a(usageInfo2.h), otk.UNKNOWN);
        if (o.c) {
            o.c();
            o.c = false;
        }
        ovc ovc3 = (ovc) o.b;
        ovc3.l = otk.d;
        ovc3.a |= 1024;
        String str6 = ovc3.f;
        DocumentContents documentContents = usageInfo2.e;
        if (documentContents != null) {
            DocumentSection[] documentSectionArr = documentContents.a;
            aucd o2 = oqo.g.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            oqo oqo2 = (oqo) o2.b;
            str6.getClass();
            oqo2.a |= 2;
            oqo2.c = str6;
            int i7 = 0;
            while (i7 < documentSectionArr.length) {
                DocumentSection documentSection = documentSectionArr[i7];
                aucd o3 = oqn.e.o();
                if (o3.c) {
                    o3.c();
                    o3.c = z;
                }
                oqn oqn = (oqn) o3.b;
                oqn.a |= 1;
                oqn.b = i7;
                try {
                    String str7 = documentSection.c;
                    auay a2 = auay.a(str7 != null ? str7.getBytes("UTF-8") : documentSection.f);
                    if (o3.c) {
                        o3.c();
                        o3.c = z;
                    }
                    oqn oqn2 = (oqn) o3.b;
                    a2.getClass();
                    oqn2.a |= 4;
                    oqn2.c = a2;
                    oqy a3 = ozq.a(documentSection.d);
                    aucd aucd = (aucd) a3.c(5);
                    aucd.a((aucj) a3);
                    if (documentSection.e != DocumentSection.a) {
                        int i8 = documentSection.e;
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = z;
                        }
                        oqy oqy = (oqy) aucd.b;
                        auct auct = oqy.i;
                        oqy.a |= 512;
                        oqy.n = i8;
                    }
                    if (o3.c) {
                        o3.c();
                        o3.c = z;
                    }
                    oqn oqn3 = (oqn) o3.b;
                    oqy oqy2 = (oqy) aucd.i();
                    oqy2.getClass();
                    oqn3.d = oqy2;
                    oqn3.a |= 32;
                    if (axrj.b() && documentContents.d != null && ".private:action".equals(documentSection.d.a)) {
                        try {
                            bazc bazc = (bazc) aucj.a((aucj) bazc.d, documentSection.f, aubs.c());
                            aucd o4 = bazd.g.o();
                            String str8 = documentContents.d.name;
                            if (o4.c) {
                                o4.c();
                                o4.c = z;
                            }
                            bazd bazd = (bazd) o4.b;
                            str8.getClass();
                            bazd.a |= 2;
                            bazd.c = str8;
                            bazd bazd2 = (bazd) o4.i();
                            aucd o5 = baza.d.o();
                            if (o5.c) {
                                o5.c();
                                o5.c = z;
                            }
                            baza baza = (baza) o5.b;
                            "account".getClass();
                            int i9 = baza.a | 1;
                            baza.a = i9;
                            baza.b = "account";
                            bazd2.getClass();
                            baza.c = bazd2;
                            baza.a = i9 | 2;
                            aucd aucd2 = (aucd) bazc.c(5);
                            aucd2.a((aucj) bazc);
                            bazb bazb = (bazb) aucd2;
                            bazb.a((baza) o5.i());
                            auay au = ((bazc) bazb.i()).au();
                            if (o3.c) {
                                o3.c();
                                o3.c = false;
                            }
                            oqn oqn4 = (oqn) o3.b;
                            au.getClass();
                            oqn4.a |= 4;
                            oqn4.c = au;
                        } catch (auda e) {
                            oso.b("Unabled to parse the provided action.");
                        }
                    }
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    oqo oqo3 = (oqo) o2.b;
                    oqn oqn5 = (oqn) o3.i();
                    oqn5.getClass();
                    oqo3.a();
                    oqo3.e.add(oqn5);
                    i7++;
                    z = false;
                } catch (UnsupportedEncodingException e2) {
                    throw new IllegalStateException(e2);
                }
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            oqo oqo4 = (oqo) o2.b;
            oqo4.a |= 8;
            oqo4.f = j2;
            oqo = (oqo) o2.i();
        } else {
            oqo = oqo.g;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        ovc ovc4 = (ovc) o.b;
        oqo.getClass();
        ovc4.i = oqo;
        ovc4.a |= 128;
        if (!(list2 == null || (indexOf = list2.indexOf(str2)) == -1)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            ovc ovc5 = (ovc) o.b;
            ovc5.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            ovc5.j = indexOf;
        }
        return (ovc) o.i();
    }

    public final ParcelFileDescriptor a() {
        ParcelFileDescriptor parcelFileDescriptor;
        jku jku = this.c;
        synchronized (jku.a) {
            jku.a();
            File fileStreamPath = jku.c.getFileStreamPath(jku.b);
            parcelFileDescriptor = null;
            if (fileStreamPath.exists()) {
                try {
                    parcelFileDescriptor = ParcelFileDescriptor.open(fileStreamPath, 268435456);
                    if (!fileStreamPath.delete()) {
                        Log.e("ProtoLiteFileLogger", "Failed to delete file.");
                    }
                } catch (FileNotFoundException e) {
                    Log.e("ProtoLiteFileLogger", "Unexpected FileNotFoundException when reading file.");
                }
            }
        }
        return parcelFileDescriptor;
    }

    public final boolean a(UsageInfo[] usageInfoArr, String str, long j, List list, Runnable runnable) {
        boolean z;
        ArrayList arrayList = new ArrayList(usageInfoArr.length);
        boolean z2 = false;
        for (UsageInfo usageInfo : usageInfoArr) {
            if (usageInfo != null) {
                if (usageInfo.c != 4) {
                    int i = usageInfo.h;
                    if (i == 0) {
                        oso.a("Dropping unknown event status from %s", (Object) str);
                    } else if (i == 2 && usageInfo.e == null) {
                        oso.a("Dropping viewEnd event without a document.");
                    } else {
                        arrayList.add(a(usageInfo, str, j, list));
                    }
                } else {
                    oso.a("Dropping context-only usage from %s", (Object) str);
                }
            }
        }
        jku jku = this.c;
        ByteBuffer a2 = jkw.a(arrayList, false);
        synchronized (jku.a) {
            synchronized (jku.a) {
                if (jku.d == null) {
                    try {
                        jku.d = jku.c.openFileOutput(jku.b, 32768);
                    } catch (FileNotFoundException e) {
                        Log.e("ProtoLiteFileLogger", "Failed to open usage log file", e);
                    }
                }
            }
            try {
                FileChannel channel = jku.d.getChannel();
                if (channel.size() + ((long) a2.capacity()) >= 102400) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    channel.write(a2);
                    jku.d.flush();
                    z2 = true;
                } catch (IOException e2) {
                }
            } catch (IOException e3) {
                z = false;
            }
        }
        if (runnable != null && z) {
            runnable.run();
            return z2;
        }
        return z2;
    }
}
