import java.util.Date;

public class Block {

    private String previousHash;
    private String data;
    private Long timestamp;
    private int nonce;
    private String currentHash;

    public Block(String previousHash, String data) {
        this.previousHash = previousHash;
        this.data = data;
        this.timestamp = new Date().getTime();
        this.nonce = 0;
        this.currentHash = calculateHash();
    }

    public String getCurrentHash() {
        return currentHash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public String calculateHash() {
        String calculateHash = UtilityClass.getSHA256Hash(
                previousHash + data + Long.toString(timestamp) + Integer.toString(nonce)
        );
        return calculateHash;
    }

    public void mineBlock(int difficulty) throws Exception {
        String target = UtilityClass.getDifficultyString(difficulty);
        while (!currentHash.substring(0, difficulty).equals(target)) {
            nonce++;
            currentHash = calculateHash();
        }
        System.out.println("Block is mined: " + currentHash);
    }
}