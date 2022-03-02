package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.firebase.appindexing.internal.ActionImpl;
import java.io.UnsupportedEncodingException;
import java.util.zip.CRC32;

/* renamed from: oym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oym {
    private static Intent a(ActionImpl actionImpl) {
        Uri parse = Uri.parse(actionImpl.c);
        String host = parse.getHost();
        if (host == null) {
            host = "";
        }
        if (!host.isEmpty()) {
            return new Intent("android.intent.action.VIEW", parse);
        }
        String valueOf = String.valueOf(parse);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 98);
        sb.append("AppIndex: The web URL must have a host (follow the format http(s)://<host>/<path>). Provided URI: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public static UsageInfo b(ActionImpl actionImpl, long j, String str) {
        duo a = a(actionImpl, j, a(actionImpl));
        a.e = true;
        a.a = new DocumentId("com.google.android.gms", str, actionImpl.c);
        return a.a();
    }

    public static UsageInfo a(ActionImpl actionImpl, long j, String str) {
        Intent a = a(actionImpl);
        duo a2 = a(actionImpl, j, a);
        String uri = a.toUri(1);
        CRC32 crc32 = new CRC32();
        try {
            crc32.update(uri.getBytes("UTF-8"));
            a2.a = new DocumentId(str, "", Long.toHexString(crc32.getValue()));
            return a2.a();
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.duo a(com.google.firebase.appindexing.internal.ActionImpl r9, long r10, android.content.Intent r12) {
        /*
            com.google.firebase.appindexing.internal.ActionImpl$MetadataImpl r0 = r9.e
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x0008
            r0 = 5
            goto L_0x0009
        L_0x0008:
            r0 = 4
        L_0x0009:
            java.lang.String r1 = r9.d
            r2 = 0
            if (r1 == 0) goto L_0x0013
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            java.lang.String r3 = r9.b
            dsl r4 = new dsl
            r4.<init>()
            com.google.android.gms.appdatasearch.DocumentSection r3 = com.google.android.gms.appdatasearch.UsageInfo.a((java.lang.String) r3)
            r4.a(r3)
            if (r1 == 0) goto L_0x002b
            com.google.android.gms.appdatasearch.DocumentSection r1 = com.google.android.gms.appdatasearch.UsageInfo.a((android.net.Uri) r1)
            r4.a(r1)
        L_0x002b:
            java.lang.String r1 = r12.getAction()
            if (r1 == 0) goto L_0x003a
            java.lang.String r3 = "intent_action"
            com.google.android.gms.appdatasearch.DocumentSection r1 = com.google.android.gms.appdatasearch.UsageInfo.a(r3, r1)
            r4.a(r1)
        L_0x003a:
            java.lang.String r1 = r12.getDataString()
            if (r1 == 0) goto L_0x0049
            java.lang.String r3 = "intent_data"
            com.google.android.gms.appdatasearch.DocumentSection r1 = com.google.android.gms.appdatasearch.UsageInfo.a(r3, r1)
            r4.a(r1)
        L_0x0049:
            android.content.ComponentName r1 = r12.getComponent()
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = r1.getClassName()
            java.lang.String r3 = "intent_activity"
            com.google.android.gms.appdatasearch.DocumentSection r1 = com.google.android.gms.appdatasearch.UsageInfo.a(r3, r1)
            r4.a(r1)
        L_0x005c:
            android.os.Bundle r12 = r12.getExtras()
            if (r12 == 0) goto L_0x0075
            java.lang.String r1 = "intent_extra_data_key"
            java.lang.String r12 = r12.getString(r1)
            if (r12 != 0) goto L_0x006b
            goto L_0x0075
        L_0x006b:
            java.lang.String r1 = "intent_extra_data"
            com.google.android.gms.appdatasearch.DocumentSection r12 = com.google.android.gms.appdatasearch.UsageInfo.a(r1, r12)
            r4.a(r12)
        L_0x0075:
            com.google.firebase.appindexing.internal.ActionImpl$MetadataImpl r12 = r9.e
            byte[] r12 = r12.e
            if (r12 != 0) goto L_0x007c
            goto L_0x0089
        L_0x007c:
            int r1 = r12.length
            if (r1 <= 0) goto L_0x0089
            com.google.android.gms.appdatasearch.DocumentSection r1 = new com.google.android.gms.appdatasearch.DocumentSection
            com.google.android.gms.appdatasearch.RegisterSectionInfo r3 = com.google.android.gms.appdatasearch.DocumentSection.b
            r1.<init>((byte[]) r12, (com.google.android.gms.appdatasearch.RegisterSectionInfo) r3)
            r4.a(r1)
        L_0x0089:
            com.google.firebase.appindexing.internal.ActionImpl$MetadataImpl r12 = r9.e
            java.lang.String r12 = r12.d
            if (r12 == 0) goto L_0x009e
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L_0x009e
            android.accounts.Account r1 = new android.accounts.Account
            java.lang.String r3 = "com.google"
            r1.<init>(r12, r3)
            r4.b = r1
        L_0x009e:
            dvm r12 = new dvm
            r12.<init>()
            java.lang.String r1 = r9.b
            defpackage.iva.a((java.lang.Object) r1)
            java.lang.String r3 = "name"
            r12.b(r3, r1)
            java.lang.String r1 = r9.c
            android.net.Uri r1 = android.net.Uri.parse(r1)
            defpackage.iva.a((java.lang.Object) r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "url"
            r12.b(r5, r1)
            java.lang.String r1 = r9.d
            if (r1 != 0) goto L_0x00c4
            goto L_0x00ca
        L_0x00c4:
            java.lang.String r6 = "id"
            r12.b(r6, r1)
        L_0x00ca:
            dvl r1 = new dvl
            java.lang.String r6 = r9.a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "http://schema.org/"
            int r8 = r6.length()
            if (r8 != 0) goto L_0x00e0
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
            goto L_0x00e4
        L_0x00e0:
            java.lang.String r6 = r7.concat(r6)
        L_0x00e4:
            r1.<init>(r6)
            dvn r6 = new dvn
            android.os.Bundle r12 = r12.a
            r6.<init>(r12)
            defpackage.iva.a((java.lang.Object) r6)
            java.lang.String r12 = "object"
            defpackage.iva.a((java.lang.Object) r12)
            android.os.Bundle r7 = r1.a
            android.os.Bundle r6 = r6.a
            r7.putParcelable(r12, r6)
            java.lang.String r6 = r9.f
            if (r6 != 0) goto L_0x0102
            goto L_0x0105
        L_0x0102:
            r1.a(r6)
        L_0x0105:
            com.google.firebase.appindexing.internal.ActionImpl$MetadataImpl r6 = r9.e
            java.lang.String r6 = r6.c
            if (r6 == 0) goto L_0x0110
            java.lang.String r7 = "completionToken"
            r1.a(r7, r6)
        L_0x0110:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            android.os.Bundle r7 = r9.g
            r6.putAll(r7)
            android.os.Bundle r7 = r1.a
            java.lang.Object r7 = r7.get(r12)
            java.lang.String r8 = "setObject is required before calling build()."
            defpackage.iva.a((java.lang.Object) r7, (java.lang.Object) r8)
            android.os.Bundle r7 = r1.a
            java.lang.String r8 = "type"
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r8 = "setType is required before calling build()."
            defpackage.iva.a((java.lang.Object) r7, (java.lang.Object) r8)
            android.os.Bundle r7 = r1.a
            android.os.Parcelable r12 = r7.getParcelable(r12)
            android.os.Bundle r12 = (android.os.Bundle) r12
            java.lang.Object r3 = r12.get(r3)
            java.lang.String r7 = "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))"
            defpackage.iva.a((java.lang.Object) r3, (java.lang.Object) r7)
            java.lang.Object r12 = r12.get(r5)
            java.lang.String r3 = "Must call setObject() with a valid app URI. Example: setObject(new Thing.Builder().setName(name).setUrl(url))"
            defpackage.iva.a((java.lang.Object) r12, (java.lang.Object) r3)
            dvn r12 = new dvn
            android.os.Bundle r1 = r1.a
            r12.<init>(r1)
            android.os.Bundle r12 = r12.a
            r6.putAll(r12)
            bazc r12 = defpackage.dvb.a(r6)
            java.lang.String r1 = ".private:action"
            com.google.android.gms.appdatasearch.DocumentSection r12 = defpackage.dvb.a(r1, r12)
            r4.a(r12)
            duo r12 = new duo
            r12.<init>()
            r12.b = r10
            r12.c = r0
            java.lang.String r10 = r9.a
            r12.g = r10
            com.google.android.gms.appdatasearch.DocumentContents r10 = new com.google.android.gms.appdatasearch.DocumentContents
            android.accounts.Account r11 = r4.b
            java.util.List r0 = r4.a
            if (r0 == 0) goto L_0x0188
            int r1 = r0.size()
            com.google.android.gms.appdatasearch.DocumentSection[] r1 = new com.google.android.gms.appdatasearch.DocumentSection[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            r2 = r0
            com.google.android.gms.appdatasearch.DocumentSection[] r2 = (com.google.android.gms.appdatasearch.DocumentSection[]) r2
            goto L_0x0189
        L_0x0188:
        L_0x0189:
            r10.<init>(r11, r2)
            r12.d = r10
            com.google.firebase.appindexing.internal.ActionImpl$MetadataImpl r9 = r9.e
            boolean r10 = r9.b
            r10 = r10 ^ 1
            r12.e = r10
            int r9 = r9.a
            r12.f = r9
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oym.a(com.google.firebase.appindexing.internal.ActionImpl, long, android.content.Intent):duo");
    }
}
