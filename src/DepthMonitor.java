
class DepthMonitor 
{

	int closestWinDepth;
	double score;
	double alpha, beta;
	boolean winning;
	double winningProbability;


	DepthMonitor() {
		closestWinDepth = 0;
		score = 0;
		alpha = -1000;
		beta = 1000;
		winning = false;
		winningProbability = 0.0;
	}

	DepthMonitor(int depth, double score, double alpha, double beta, boolean winning, double winningProb) {
		this.closestWinDepth = depth;
		this.score = score;
		this.alpha = alpha;
		this.beta = beta;
		this.winning = winning;
		this.winningProbability = winningProb;
	}

	DepthMonitor(DepthMonitor x) {
		closestWinDepth = x.closestWinDepth;
		score = x.score;
		alpha = x.alpha;
		beta = x.beta;
		winning = x.winning;
		winningProbability = x.winningProbability;
		
	}
}
