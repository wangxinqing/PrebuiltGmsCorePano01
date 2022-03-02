package defpackage;

/* renamed from: ayan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ayan {
    double accuracyFactor();

    long accuracyOutputFilterMaxAgeInWindowNanos();

    boolean allowProposingFromGnss();

    double altitudeFilterFloorLabelValidTimeSeconds();

    double altitudeFilterGpsValidTimeSeconds();

    double altitudeFilterWifiValidTimeSeconds();

    boolean alwaysRunAfterOneStep();

    double blueskyShadowsProbabilityDensityForInvalidGrid();

    double blueskyShadowsProbabilityDeweightingFactor();

    double blueskyUpdateMaxAgeS();

    double blueskyUpdateTimeoutForProposeFromGnssSec();

    boolean clearcutFlpVersionsFix147319069();

    boolean clearcutFlpVersionsLoggingEnabled();

    boolean enableAccuracyOutputFilter();

    boolean enableActivityAwareKalmanFilter();

    boolean enableArForDriving();

    boolean enableBearingRangeFix143083454();

    boolean enableBlueskyShadowLikelihood();

    boolean enableDifferentialBearingFix140500114();

    boolean enableIncomingPositionAccuracyScaling();

    boolean enableLogcatLogger();

    boolean enableOutputFilterTimestampFix();

    boolean enableOutputKalmanFilter();

    long flpInertialAnchorBugReportBufferSizeBytes();

    long flpInertialAnchorConfigurationIndex();

    boolean flpInertialAnchorUseStatefulLogging();

    long flpParticleFusionBugReportMaxBufferSize();

    boolean flpParticleFusionBugReportStoreDataArrayOnly();

    double flpParticleFusionBugReportWindowSec();

    long flpParticleFusionClearcutMaxCarryChangeDeltas();

    long flpParticleFusionClearcutMaxFilterUpDeltas();

    long flpParticleFusionClearcutMaxPositionReInitDeltas();

    long flpParticleFusionClearcutMaxReProjectionDeltas();

    boolean flpParticleFusionExtendedBugReport();

    double flpParticleFusionRejectionThresholdSigmaMultiplier();

    boolean flpParticleFusionUseFop();

    boolean flpParticleFusionUsePositionLikelihoodClipping();

    boolean flpReportLocationOnStepUpdate();

    boolean flpUseParticleFusion();

    double gnssMaxStdDevM();

    double gnssMinStdDevM();

    double gnssRejectionDistanceM();

    double gnssRejectionPeriodS();

    double gnssStdDevScale();

    double initializationWindowLengthS();

    double maxAccuracyM();

    double maxBearingGapS();

    double maxGnssAgeForNotRequestingWifiScansS();

    double maxGnssEvidenceAgeS();

    double maxGnssWifiDistanceForGnssOnlyM();

    double maxStepEvidenceAgeS();

    double maxWifiEvidenceAgeS();

    double minAccuracyM();

    double nominalSigmaScaleGnss();

    double nominalSigmaScaleWifi();

    boolean notRequestWifiScansWhenProposingFromGnss();

    long numberOfParticles();

    boolean outputKalmanFilterEnableReset();

    double outputKalmanFilterResetThresholdM();

    double outputLinearKfProcessNoiseFeetPosM();

    double outputLinearKfProcessNoiseFeetVelMps();

    double outputLinearKfProcessNoiseUnknownPosM();

    double outputLinearKfProcessNoiseUnknownVelMps();

    double outputLinearKfProcessNoiseWheelsPosM();

    double outputLinearKfProcessNoiseWheelsVelMps();

    double positionEmitThresholdS();

    double positionProposalGnssBlueskyMinSpeedThresholdMps();

    double positionProposalGnssMaxAccuracyThresholdM();

    double positionProposalGnssMinSpeedThresholdMps();

    double reInitAccuracyThresholdMultiplierGnss();

    double reInitAccuracyThresholdMultiplierWifi();

    long requiredStepCount();

    double resamplingThreshold();

    boolean resetLocationAfterReinit();

    boolean resetLocationAfterReinitV2();

    double speedUpperThresholdMps();

    double stepLengthFactor();

    double stepLengthNoiseSigmaM();

    double stepTimeoutThresholdSeconds();

    double temporalHeadingNoiseSigmaRad();

    double temporalPositionNoiseSigmaM();

    boolean useAltitudeFilter();

    boolean useNStepActivationFilter();

    long wifiAccuracyUpperBoundBeforeRejectedMm();

    double wifiMaxStdDevM();

    double wifiMinStdDevM();

    double wifiRejectionDistanceM();

    double wifiRejectionPeriodS();

    double wifiStdDevScale();
}
