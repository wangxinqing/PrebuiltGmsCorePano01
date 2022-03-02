package com.google.android.gms.org.conscrypt.ct;

import com.google.android.gms.org.conscrypt.ct.VerifiedSCT;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CTVerificationResult {
    private final ArrayList invalidSCTs = new ArrayList();
    private final ArrayList validSCTs = new ArrayList();

    public void add(VerifiedSCT verifiedSCT) {
        if (verifiedSCT.status == VerifiedSCT.Status.VALID) {
            this.validSCTs.add(verifiedSCT);
        } else {
            this.invalidSCTs.add(verifiedSCT);
        }
    }

    public List getInvalidSCTs() {
        return Collections.unmodifiableList(this.invalidSCTs);
    }

    public List getValidSCTs() {
        return Collections.unmodifiableList(this.validSCTs);
    }
}
