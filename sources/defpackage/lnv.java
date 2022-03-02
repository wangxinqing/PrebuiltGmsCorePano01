package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.internal.model.File;
import java.util.Formatter;

/* renamed from: lnv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lnv extends iyv {
    public final izb a;

    public lnv(izb izb) {
        this.a = izb;
    }

    public final File a(ClientContext clientContext, String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, Boolean bool4, Boolean bool5, String str3, Integer num, Boolean bool6, iyu iyu) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("files/%1$s", new Object[]{iyv.a(str)});
        iyu.a(sb);
        iyv.a(sb, "acknowledgeAbuse", String.valueOf(bool));
        iyv.a(sb, "allProperties", String.valueOf(bool2));
        if (bool3 != null) {
            iyv.a(sb, "errorRecovery", String.valueOf(bool3));
        }
        if (str2 != null) {
            iyv.a(sb, "fileScopeAppIds", iyv.a(str2));
        }
        if (bool4 != null) {
            iyv.a(sb, "mutationPrecondition", String.valueOf(bool4));
        }
        if (bool5 != null) {
            iyv.a(sb, "openDrive", String.valueOf(bool5));
        }
        if (str3 != null) {
            iyv.a(sb, "reason", iyv.a(str3));
        }
        if (num != null) {
            iyv.a(sb, "syncType", String.valueOf(num));
        }
        iyv.a(sb, "updateViewedDate", String.valueOf(bool6));
        return (File) this.a.a(clientContext, 0, sb.toString(), (Object) null, File.class);
    }

    public final File a(ClientContext clientContext, String str, Boolean bool, Boolean bool2, String str2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str3, Boolean bool8, Integer num, Boolean bool9, Boolean bool10, File file, iyu iyu) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("files/%1$s", new Object[]{iyv.a(str)});
        iyu.a(sb);
        iyv.a(sb, "convert", String.valueOf(bool));
        if (bool2 != null) {
            iyv.a(sb, "errorRecovery", String.valueOf(bool2));
        }
        if (str2 != null) {
            iyv.a(sb, "modifiedDateBehavior", iyv.a(str2));
        }
        if (bool3 != null) {
            iyv.a(sb, "mutationPrecondition", String.valueOf(bool3));
        }
        iyv.a(sb, "newRevision", String.valueOf(bool4));
        iyv.a(sb, "ocr", String.valueOf(bool5));
        if (bool6 != null) {
            iyv.a(sb, "openDrive", String.valueOf(bool6));
        }
        iyv.a(sb, "pinned", String.valueOf(bool7));
        if (str3 != null) {
            iyv.a(sb, "reason", iyv.a(str3));
        }
        iyv.a(sb, "setModifiedDate", String.valueOf(bool8));
        if (num != null) {
            iyv.a(sb, "syncType", String.valueOf(num));
        }
        iyv.a(sb, "updateViewedDate", String.valueOf(bool9));
        iyv.a(sb, "useContentAsIndexableText", String.valueOf(bool10));
        return (File) this.a.a(clientContext, 2, sb.toString(), (Object) file, File.class);
    }

    public final void a(ClientContext clientContext, String str, String str2, String str3, File file, iyu iyu) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("files/%1$s", new Object[]{iyv.a(str)});
        iyu.a(sb);
        if (str2 != null) {
            iyv.a(sb, "addParents", iyv.a(str2));
        }
        if (str3 != null) {
            iyv.a(sb, "removeParents", iyv.a(str3));
        }
        ClientContext clientContext2 = clientContext;
        File file2 = (File) this.a.a(clientContext2, 7, sb.toString(), (Object) file, File.class);
    }
}
