package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.ScoringConfig;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import java.util.ArrayList;
import java.util.List;

/* renamed from: oyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oyc {
    public static RegisterCorpusInfoCall$Request a(oxe oxe) {
        boolean z;
        boolean z2;
        boolean z3;
        dtl a = RegisterCorpusInfo.a(oxe.b());
        a.a = Integer.toString(oxe.a.e);
        String valueOf = String.valueOf(oxv.a);
        String encode = Uri.encode(oxe.c());
        String encode2 = Uri.encode(oxe.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15 + String.valueOf(encode).length() + String.valueOf(encode2).length());
        sb.append(valueOf);
        sb.append("/?type=");
        sb.append(encode);
        sb.append("&client=");
        sb.append(encode2);
        a.b = Uri.parse(sb.toString());
        String str = oxe.b;
        String str2 = oxe.a.b;
        if (((Boolean) pba.a.c()).booleanValue()) {
            aucx aucx = axry.a.a().d().a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
            sb2.append(str);
            sb2.append(":");
            sb2.append(str2);
            z = !aucx.contains(sb2.toString());
        } else {
            z = false;
        }
        a.e = z;
        a.j = ((Integer) ozx.bi.c()).intValue();
        if (aplx.b(oxe.c)) {
            a.d = new dsx().a();
        }
        dtn a2 = RegisterSectionInfo.a("thing_proto");
        a2.a = "blob";
        a2.b = true;
        a.a(a2);
        aucx aucx2 = oxe.a.d;
        int size = aucx2.size();
        for (int i = 0; i < size; i++) {
            ovn ovn = (ovn) aucx2.get(i);
            dtn a3 = RegisterSectionInfo.a(ovn.b);
            a3.e = "\u0000";
            if (ovn.d.equals("plain") || ovn.d.equals("rfc822") || ovn.d.equals("url")) {
                z2 = true;
            } else {
                z2 = false;
            }
            a3.d = z2;
            a3.a = ovn.d;
            int i2 = ovn.e;
            a3.c = i2;
            if (i2 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            a3.b = z3;
            dtw a4 = ScoringConfig.a();
            plh plh = ovn.g;
            if (plh == null) {
                plh = plh.b;
            }
            a4.a = plh.a;
            a3.g = a4.a();
            if (!ovn.f.isEmpty()) {
                a3.a(dud.a((String[]) ovn.f.toArray(new String[0])));
            }
            String str3 = oxe.b;
            String str4 = oxe.a.b;
            String str5 = ovn.b;
            if ("com.google.android.gms".equals(str3) && "Person".equals(str4) && ("name".equals(str5) || "additionalName".equals(str5))) {
                a3.a(dud.a());
            }
            a.a(a3.a());
        }
        RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request = new RegisterCorpusInfoCall$Request();
        registerCorpusInfoCall$Request.a = oxe.b;
        registerCorpusInfoCall$Request.b = oxe.b();
        registerCorpusInfoCall$Request.c = a.a();
        return registerCorpusInfoCall$Request;
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str).length());
        sb.append("CREATE INDEX [");
        sb.append(str);
        sb.append("_uri_index] ON [");
        sb.append(str);
        sb.append("](uri)");
        return sb.toString();
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('[');
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    public static List a(ovo ovo) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("seqno", "INTEGER PRIMARY KEY AUTOINCREMENT"));
        arrayList.add(new Pair("action", "STRING"));
        arrayList.add(new Pair("uri", "STRING"));
        arrayList.add(new Pair("tag", "STRING"));
        arrayList.add(new Pair("doc_score", "INTEGER"));
        arrayList.add(new Pair("created_timestamp", "INTEGER"));
        arrayList.add(new Pair("section_thing_proto", "BLOB"));
        aucx aucx = ovo.d;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            String valueOf = String.valueOf(((ovn) aucx.get(i)).b);
            arrayList.add(new Pair(valueOf.length() == 0 ? new String("section_") : "section_".concat(valueOf), "STRING"));
        }
        return arrayList;
    }
}
