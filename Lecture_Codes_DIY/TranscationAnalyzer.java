
public class TranscationAnalyzer {
    public List<Transcation> topTranscations() {
        MinPQ<Transcation> topTranscations = new HeapMinPQ<Transcation>();
        for (Transcation t : ts) {
            topTranscations.add(t);
            if (topTranscations.size() > M) {
                topTranscations.removeSmallest();
            }
        }

        List<Transcation> transcationList = new ArrayList<Transcation>();
        while (topTranscations.size() > 0) {
            transcationList.add(topTranscations.removeSmallest());
        }
        return transcationList;
    }
}
