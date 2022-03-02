package defpackage;

import android.net.Uri;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.util.Arrays;

/* renamed from: akhn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akhn implements acvp {
    final /* synthetic */ akho a;

    public akhn(akho akho) {
        this.a = akho;
    }

    public final void a(acwa acwa) {
        if (!((acwi) acwa).d && acwa.b()) {
            FileGroupResponse fileGroupResponse = (FileGroupResponse) acwa.d();
            if (fileGroupResponse.c.size() == 1) {
                agzs agzs = new agzs(Arrays.asList(new ahcn[]{agzx.a(this.a.a).a()}));
                MddFile mddFile = (MddFile) fileGroupResponse.c.get(0);
                if (!mddFile.a.equals(this.a.c)) {
                    try {
                        byte[] b = jjt.b((InputStream) agzs.a(Uri.parse(mddFile.b), ahcj.a(), new agzk[0]));
                        akho akho = this.a;
                        akho.a(3, akho.a(b));
                        this.a.c(3);
                        aklz.a();
                        this.a.c = mddFile.a;
                    } catch (auda | InvalidObjectException e) {
                        this.a.a(4);
                    } catch (IOException e2) {
                        this.a.a(7);
                    }
                } else {
                    this.a.c(3);
                }
            } else {
                this.a.a(3);
            }
        } else {
            aklz.a();
            this.a.a(6);
        }
    }
}
