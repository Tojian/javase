


public class Quick {
	//��ȡһ��Ԫ�� (���һ��) Ϊ����
	//���б���С��Ԫ��һ��ǰ�ţ��������Ԫ��һ�ɺ�ţ��γ����������ӱ�
	//�Ը��ӱ�����ѡ������Ԫ�ز����˹��������ֱ��ÿ���ӱ��Ԫ��ֻʣһ��

	//һ��������̺����Ƿ�����Ŧ��λ��
	public int partition(int A[],int left,int right){

		//ѡ����ŦԪ��
		int p=A[left];
		if(left<right){
		//���βָ��λ�õ�������Ŧ��Ҫ���ƶ�βָ���λ�ã�����Ͱ���ָʾ��ֵ����ָ���λ��
			while(left<right&&A[right]>=p)--right;
			A[left]=A[right];
	//�����ָ��λ�õ�������Ŧ��ҪС���ƶ���ָ���λ�ã�����Ͱ���ָʾ��ֵ��βָ���λ��
		while(left<right&&A[right]<=p) ++left;
			A[right]=A[left];
		}
		//��ʱ����βָ���Ѿ���ȣ�����Ŧ��ֵ������βָ����ȵ�λ�ü���
		A[left]=p;
		return left;
	}

	//��������ĵݹ�
	public void QuickSort(int A[],int left,int right){
	 //����һ����Ŧ��λ��
		int pnode;
		if(left<right){	
			pnode=partition(A,left,right);
			QuickSort(A,left,pnode-1);
			QuickSort(A,pnode+1,right);
		}
	}

	
}
