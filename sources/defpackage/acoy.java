package defpackage;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.UnknownHostException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.util.EntityUtils;

/* renamed from: acoy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acoy {
    public static final iwd a = new iwd("D2D", "WifiBackupServerManager");
    public final Context b;
    private final opc c;

    public acoy(Context context) {
        opc opc = new opc(context, "Android-Backup/1.0", false);
        iwd iwd = acpb.a;
        this.b = context;
        this.c = opc;
    }

    public static final String a(Context context, Account account) {
        try {
            String c2 = acpd.a(context).c(account, "android");
            if (c2 != null) {
                return c2;
            }
            throw new AuthenticatorException("No Auth Token");
        } catch (OperationCanceledException e) {
            a.e("OperationCanceledException in getAuthToken", e, new Object[0]);
            return null;
        } catch (IOException e2) {
            a.e("IOException in getAuthToken", e2, new Object[0]);
            return null;
        } catch (AuthenticatorException e3) {
            a.e("AuthenticatorException in getAuthToken", e3, new Object[0]);
            return null;
        }
    }

    public final gsm a(gsf gsf) {
        String str;
        if (gsf == null) {
            a.e("backupRequest was null; not performing executeBackupRequestBlocking.", new Object[0]);
            return null;
        }
        izj.b(1029);
        try {
            byte[] k = gsf.k();
            if (!jix.a(this.b)) {
                str = awpu.a.a().a();
            } else if (awpu.a.a().c()) {
                str = String.format("https://%s/backup", new Object[]{jli.a("gms.backup.sw_domain", "android.googleapis.com")});
            } else {
                str = awpu.a.a().b();
            }
            HttpPost httpPost = new HttpPost(str);
            httpPost.setHeader("Content-Type", "application/octet-stream");
            httpPost.setEntity(new ByteArrayEntity(k));
            HttpResponse execute = this.c.execute(httpPost);
            HttpEntity entity = execute.getEntity();
            if (execute.getStatusLine().getStatusCode() == 503) {
                a.a("Sc Service Unavailable", new Object[0]);
                izj.a();
                return null;
            } else if (execute.getStatusLine().getStatusCode() != 200) {
                if (entity != null) {
                    entity.consumeContent();
                }
                String valueOf = String.valueOf(EntityUtils.toString(execute.getEntity()));
                throw new IOException(valueOf.length() == 0 ? new String("Server rejected backup: ") : "Server rejected backup: ".concat(valueOf));
            } else if (entity != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                gsm gsm = (gsm) aucj.a((aucj) gsm.c, byteArrayOutputStream.toByteArray(), aubs.c());
                izj.a();
                return gsm;
            } else {
                throw new IOException("Missing response body");
            }
        } catch (UnknownHostException e) {
            a.e("No connection", e, new Object[0]);
        } catch (IOException e2) {
            a.e("IOException", e2, new Object[0]);
        } catch (Throwable th) {
            izj.a();
            throw th;
        }
    }

    public final void a(String str, acox acox) {
        new Thread(new acow(this, str, acox)).start();
    }
}
