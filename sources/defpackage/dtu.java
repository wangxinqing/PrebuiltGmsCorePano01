package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.UserHandle;
import com.google.android.chimera.Service;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.appdatasearch.SearchResults;
import org.chromium.net.UrlRequest;

/* renamed from: dtu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dtu {
    public static String a(int i) {
        switch (i - 2) {
            case 2:
                return "PARSE_ERROR";
            case 3:
                return "TOO_LONG";
            case 4:
                return "PARENS_NESTED_TOO_DEEP";
            case 5:
                return "DATE_PARSE_ERROR";
            case 6:
                return "DATE_RANGE_TOO_LARGE";
            case 7:
                return "OVERLAP_L_PARSE_ERROR";
            case 8:
                return "Q_PARSE_ERROR";
            case 9:
                return "BINARY_LOGIC_PARSE_ERROR";
            case 10:
                return "TAG_PARSE_ERROR";
            case 11:
                return "IN_L_PARSE_ERROR";
            case 12:
                return "ST_SORT_PARSE_ERROR";
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return "INIT_FAILED_ERROR";
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return "UNIMPLEMENTED_ERROR";
            case Service.START_CONTINUATION_MASK:
                return "AUTHORIZATION_ERROR";
            case 16:
                return "NO_MATCHING_CORPORA_ERROR";
            case 17:
                return "IS_PARSE_SECTION_RESTRICT_WITHOUT_STRING";
            case 18:
                return "IS_PARSE_SECTION_RESTRICT_NEGATION_NOT_SUPPORTED";
            default:
                return "UNDEFINED";
        }
    }

    public static SearchResults b(String str) {
        return new SearchResults(str);
    }

    public static PhraseAffinityResponse c(String str) {
        return new PhraseAffinityResponse(str, (CorpusId[]) null, (int[]) null);
    }

    public static UserHandle a() {
        int i = Build.VERSION.SDK_INT;
        return Process.myUserHandle();
    }

    public static DocumentResults a(String str) {
        return new DocumentResults(str, (Bundle) null, (Bundle) null, (Bundle) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r2.size() > 0) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(defpackage.oum r6) {
        /*
            aucs r0 = r6.c
            auay r6 = r6.d
            r1 = 0
            if (r0 == 0) goto L_0x0037
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r3 = 0
            r4 = 0
        L_0x000e:
            int r5 = r0.size()
            if (r3 >= r5) goto L_0x0030
            java.lang.Object r5 = r0.get(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 <= 0) goto L_0x002d
            int r5 = r5 + r4
            auay r4 = r6.a((int) r4, (int) r5)
            byte[] r4 = r4.k()
            r2.append(r3, r4)
            r4 = r5
        L_0x002d:
            int r3 = r3 + 1
            goto L_0x000e
        L_0x0030:
            int r6 = r2.size()
            if (r6 <= 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r2 = r1
        L_0x0038:
            com.google.android.gms.appdatasearch.SectionPayload r6 = new com.google.android.gms.appdatasearch.SectionPayload
            r6.<init>(r2)
            android.util.SparseArray r0 = r6.a
            if (r0 == 0) goto L_0x004c
            int r0 = r0.size()
            if (r0 == 0) goto L_0x004c
            byte[] r6 = defpackage.ivy.a(r6)
            return r6
        L_0x004c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtu.a(oum):byte[]");
    }
}
