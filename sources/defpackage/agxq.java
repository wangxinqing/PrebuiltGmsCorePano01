package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: agxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agxq implements Externalizable {
    private static final long serialVersionUID = 1;
    public final List a = new ArrayList();

    public final void readExternal(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            agxp agxp = new agxp();
            agxp.readExternal(objectInput);
            this.a.add(agxp);
        }
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        int size = this.a.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((agxp) this.a.get(i)).writeExternal(objectOutput);
        }
    }
}
