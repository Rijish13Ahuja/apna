import pandas as pd
import json
import os

def extract_data(file_path):
    try:
        df = pd.read_excel(file_path)
        data = df.to_dict(orient='records')

        output_path = os.path.join(os.path.dirname(__file__), '../globe_data.json')
        with open(output_path, 'w') as json_file:
            json.dump(data, json_file, indent=4)

        print(f"Data extraction successful. JSON file created at: {output_path}")
    except Exception as e:
        print(f"Error during data extraction: {e}")

if __name__ == "__main__":
    file_path = 'assignment_data.xlsx'  

    extract_data(file_path)
